public class forLoop {
    public static void main(String[] args) {

        int counted = 7;
        int indexState = 0;
        int indexCond = 0;

        for (; indexState < counted;) {
            System.out.println(1 + indexState + " Kitten!");
            ++indexState;
        }

        for (; indexCond < counted; indexCond++) {
            System.out.println(1 + indexCond + " Fox!");
        }

        for (int index = 0; index < counted; index++) {
            System.out.println(1 + index + " Pig!");
        }


    }
}
