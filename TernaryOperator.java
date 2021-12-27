public class TernaryOperator {
    public static void main (String[] args) {
        boolean loveCoding = true;
        boolean bugFree = false;

        String isLoveCoding = loveCoding ?
                "We love coding,\nget better at programming!" :
                "We still learn,\nneed more time";

        System.out.println(isLoveCoding);

        String myAppIsBugFree = bugFree ?
                "Is already 'app production grade'.\nEasshy !!" :
                "Still need improvement,\nnever 100% perfect!";

        System.out.println(myAppIsBugFree);

    }
}
