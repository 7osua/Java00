public class DoWhileLoop {
    public static void main (String[] args) {

        String[] numStringOfArr = new String[7];
        String[] numWords = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        int counter = 0;
        boolean isChanged = false;
        char confAllChecked = 'N';

        do {
            numStringOfArr[counter] = "" + counter;
            ++counter;
            System.out.println(numStringOfArr[counter - 1]);
        } while (counter < 7);

        do {
            System.out.print(numStringOfArr[counter - 1] + "\t");
            --counter;
        } while (counter > 0);

        System.out.print("\n");
        System.out.println(counter);

        do {
            numStringOfArr[counter] = numWords[counter];
            System.out.println(numStringOfArr[counter]);
            ++counter;
            isChanged = counter < 7 ? true : false;
        } while (isChanged);

        do {
            String initWords = numWords[counter-1];
            if(counter % 2 == 0) {
                initWords += " Is even number.";
            } else {
                initWords += " Is odd number.";
            }
            System.out.println(initWords);
            confAllChecked = counter > 1 ? 'N' : 'Y';
            --counter;
        } while (confAllChecked == 'N');

    }
}
