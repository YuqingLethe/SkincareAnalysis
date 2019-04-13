import java.util.HashSet;

public class TwoSetsComparison extends helper {
    private HashSet<String> goodSet; // Set 1
    private HashSet<String> badSet; // Set 2
    public TwoSetsComparison(HashSet set1, HashSet set2) {
        this.goodSet = set1;
        this.badSet = set2;
        makeSetLowerCase(goodSet);
        makeSetLowerCase(badSet);
    }

    protected HashSet getCommon() {
        HashSet<String> commonlist = new HashSet<>(badSet);
        commonlist.retainAll(goodSet);
        return commonlist;
    }
    protected HashSet getInSet1Only() {
        HashSet<String> greenArealist = new HashSet<>(goodSet);
        greenArealist.removeAll(badSet);
        return greenArealist;
    }
    protected HashSet getInSet2Only() {
        HashSet<String> greenArealist = new HashSet<>(badSet);
        greenArealist.removeAll(goodSet);
        return greenArealist;
    }

    public void getReport(boolean useUpperCase) {
        if ( useUpperCase ) {
            makeSetUpperCase(goodSet);
            makeSetUpperCase(badSet);
        }
        System.out.println("============================================================================");
        System.out.println("The ingredients in set1: ");
        System.out.println(goodSet);
        System.out.println("The ingredients in set2: ");
        System.out.println(badSet);
        System.out.println("============================================================================");

        System.out.println("The common ingredients are:");
        System.out.println(getCommon());
        System.out.println();
        System.out.println("Ingredients in Set 1 only: ");
        System.out.println(getInSet1Only());
        System.out.println();
        System.out.println("Ingredients in Set 2 only: ");
        System.out.println(getInSet2Only());
        System.out.println();
    }

    public static void main(String[] args) {
        TwoSetsComparison hi = new TwoSetsComparison(stringToSet(dataPool.avene_SoothingMask),
                                                     stringToSet(dataPool.to_nmf));
        hi.getReport(false);
        return;
    }
}

