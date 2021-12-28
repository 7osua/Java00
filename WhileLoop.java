public class WhileLoop {
    public static void main (String[] args) {

        int nTimes = 4;
        int counter = 0;
        boolean isFull = false;
        char charToYes = 'Y';
        String[] logToArray = new String[4];
        String[] tmpToArray = logToArray;

        while (counter < 4 ) {
            System.out.println(counter + " Loop plus");
            ++counter;
        }
        System.out.println(counter);

        while (counter > 0) {
            System.out.println(counter + " Loop minus");
            --counter;
        }
        System.out.println(counter);

        while (!isFull) {
            if (tmpToArray[counter] == null) {
                tmpToArray[counter] = "this is " + counter + " time counter.";
                System.out.println(tmpToArray[counter]);
                ++counter;
            }

            isFull = counter == tmpToArray.length ? true : false;
        }
        System.out.println(counter);
        System.out.println(isFull);

        while(isFull || counter == 1) {
            if (counter % 2 == 0 ) {
                System.out.println("This is even loop, with loop no. " + logToArray[counter - 1]);
            } else {
                System.out.println("This is odd loop, with loop no. " + logToArray[counter - 1]);
            }
            System.out.println("Current status of array is : " + isFull);
            isFull = counter > 1 ? true : false;
            --counter;
        }
        System.out.println(counter);
        System.out.println(isFull);

        while (charToYes == 'Y') {
            System.out.println(logToArray[counter]);
            logToArray[counter] = counter % 2 == 0 ?
                    "odd set to null" :
                    "even still full";
            System.out.println(logToArray[counter]);

            ++counter;
            if (counter == 4) charToYes = 'N';
        }
    }
}
