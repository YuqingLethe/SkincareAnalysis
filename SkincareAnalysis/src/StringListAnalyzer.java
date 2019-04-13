import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringListAnalyzer extends helper{
    private ArrayList<HashSet<String>> listOfSet ;
    public StringListAnalyzer (List<String> stringList) {
        this.listOfSet = new ArrayList<>();
        for (String s: stringList) {
            HashSet<String> currSet = stringToSet(s);
            helper.makeSetLowerCase(currSet);
            this.listOfSet.add(currSet);
        }
    }
    private HashSet<String> getCommonSet () {
        HashSet<String> resultSet = new HashSet<>();
        for (HashSet s : listOfSet) {
            if (resultSet.isEmpty()) {
                resultSet = new HashSet<>(s);
            }
            resultSet.retainAll(s);
        }
        return resultSet;
    }

    public void printCommon() {
        printStringList(listOfSet);
        System.out.println(getCommonSet());
    }

    private void printStringList(List<HashSet<String>> list) {
        System.out.println("----------------------------------------------------------------------------------------");
        if (list == null | list.isEmpty()) {
            System.out.println("Empty list. Please provide valid list.");
        }
        for (int i = 0; i < list.size(); i ++) {
            System.out.println("Product " + (i + 1) + ": ");
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        List<String> currList = new ArrayList<>();
        currList.add(dataPool.avene_SoothingMask);
        currList.add(dataPool.to_nmf);

        StringListAnalyzer sla = new StringListAnalyzer(currList);
        sla.printCommon();
    }
}
