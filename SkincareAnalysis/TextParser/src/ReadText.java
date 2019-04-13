import java.util.Arrays;
import java.util.HashSet;

public class ReadText {
    private HashSet<String> goodSet;
    private HashSet<String> badSet;
    public ReadText(HashSet good, HashSet bad) {
        this.goodSet = good;
        this.badSet = bad;
        printout(goodSet);
        printout(badSet);
    }
    public void ouputBlacklist() {
        HashSet<String> blacklist = badSet;
        blacklist.removeAll(goodSet);
        System.out.println("The Black List:");
        printout(blacklist);
    }

    public void outputCommon() {
        HashSet<String> list = badSet;
        list.retainAll(goodSet);
        System.out.println("The common ingredients are:");
        printout(list);
    }
    public void badListDoesnotHave() {
        HashSet<String> list = goodSet;
        list.removeAll(badSet);
        System.out.println("The ingredient bad list doesn't contain is: ");
        printout(list);
    }

    private void printout(HashSet set) {
        System.out.println(set);
    }
    public static void main(String[] args) {
        String goodList="a,b, c c";
        String badList="c c,d,e e";

        String AveneSoothingMask="AVÈNE THERMAL SPRING WATER, MINERAL OIL, STEARIC ACID, CAPRYLIC CAPRIC TRIGLYCERIDE, CARTHAMUS TINSTORIUS (SAFFLOWER) SEED OIL, HYDROGENATED PALM/ PALM KERNEL OIL PEG-6 ESTERS, TRIETHANOLAMINE, GLYCERYL STEARATE, MICROCRYSTALLINE WAX, PEG-100 STEARATE, PROPYLENE GLYCOL, CAPRYLIC/CAPRIC GLYCERIDES, CARBOMER, DISODIUM EDTA, FRAGRANCE, PHENYL TRIMETHICONE.";
        String AveneClearanceEmulsion="AVÈNE THERMAL SPRING WATER, PROPYLENE GLYCOL, CYCLOPENTASILOXANE, GLYCERIN, CYCLOHEXASILOXANE, POLYACRYLATE-13, POLYMETHYL METHACRYLATE, POLYISOBUTENE, ZINC GLUCONATE, BENZOIC ACID, CAPRYLYL GLYCOL, CETRIMONIUM BROMIDE, DIMETHICONE, DIMETHICONOL DISODIUM EDTA, FRAGRANCE (PARFUM), GLYCERYL LAURATE, POLYSORBATE 20, PYRIDOXINE HCL, SALICYLIC ACID, SODIUM HYDROXIDE, SORBITAN ISOSTEARATE, WATER.";


        HashSet<String> goodSet = new HashSet<>(Arrays.asList(AveneSoothingMask.split(",\\s*")));
        HashSet<String> badSet = new HashSet<>(Arrays.asList(AveneClearanceEmulsion.split(",\\s*")));

        ReadText hi = new ReadText(goodSet, badSet);
        hi.ouputBlacklist();
        hi.outputCommon();
        hi.badListDoesnotHave();
        return;
    }
}

