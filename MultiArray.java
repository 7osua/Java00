public class MultiArray {
    public static void main(String[] args){

        byte[][] arrOfArrByte = {
                {12, 27},
                {7, 12}
        };

        // set a new value in nested array
        arrOfArrByte[0][0] = 1;
        arrOfArrByte[0][1] = 2;
        arrOfArrByte[1][0] = 3;
        arrOfArrByte[1][1] = 4;

        // get a value from nested array
        System.out.println(arrOfArrByte[0][0]);
        System.out.println(arrOfArrByte[0][1]);
        System.out.println(arrOfArrByte[1][0]);
        System.out.println(arrOfArrByte[1][1]);

        short[][] arrOfArrShort = {
                {1_200, 3_000},
                {10_000, 2_100}
        };

        arrOfArrShort[0][0] = 4400;
        arrOfArrShort[0][1] = 7700;
        arrOfArrShort[1][0] = 4444;
        arrOfArrShort[1][1] = 7777;

        System.out.println(arrOfArrShort[0][0]);
        System.out.println(arrOfArrShort[0][1]);
        System.out.println(arrOfArrShort[1][0]);
        System.out.println(arrOfArrShort[1][1]);


        int[][] arrOfArrInt = {
                {3_000_000, 4_000_000},
                {7_000_000, 4_700_000}
        };

        arrOfArrInt[0][0] = 4_400_000;
        arrOfArrInt[0][1] = 7_700_000;
        arrOfArrInt[1][0] = 4_444_000;
        arrOfArrInt[1][1] = 7_777_000;

        System.out.println(arrOfArrInt[0][0]);
        System.out.println(arrOfArrInt[0][1]);
        System.out.println(arrOfArrInt[1][0]);
        System.out.println(arrOfArrInt[1][1]);

        long[][] arrOfArrLong = {
                {2_000_000_000L,4_000_000_000L},
                {7_000_000_000L,4_700_000_000L}
        };

        arrOfArrLong[0][0] = 2_470_000_000L;
        arrOfArrLong[0][1] = 2_477_000_000L;
        arrOfArrLong[1][0] = 2_477_444_000L;
        arrOfArrLong[1][1] = 2_777_000_000L;

        System.out.println(arrOfArrLong[0][0]);
        System.out.println(arrOfArrLong[0][1]);
        System.out.println(arrOfArrLong[1][0]);
        System.out.println(arrOfArrLong[1][1]);

        float[][] arrOfArrFloat = {
                {444_444.777F, 222_222.444F},
                {777_777.222F, 444_444.777F}
        };

        arrOfArrFloat[0][0] = 4.777F;
        arrOfArrFloat[0][1] = 7.444F;
        arrOfArrFloat[1][0] = 2.777F;
        arrOfArrFloat[1][1] = 5.777F;

        System.out.println(arrOfArrFloat[0][0]);
        System.out.println(arrOfArrFloat[0][1]);
        System.out.println(arrOfArrFloat[1][0]);
        System.out.println(arrOfArrFloat[1][1]);

        char[][] arrOfArrChar = {
                {'J','o'},
                {'s','!'}
        };

        arrOfArrChar[0][0] = 'j';
        arrOfArrChar[0][1] = 'O';
        arrOfArrChar[1][0] = 'S';
        arrOfArrChar[1][1] = '?';

        System.out.print(arrOfArrChar[0][0]);
        System.out.print(arrOfArrChar[0][1]);
        System.out.print(arrOfArrChar[1][0]);
        System.out.print(arrOfArrChar[1][1]);

        boolean[][] arrOfArrBoolean = {
                {true, true},
                {false, false}
        };

        arrOfArrBoolean[0][0] = 4 > 4.5F;
        arrOfArrBoolean[0][1] = "Josua" == "Manullang";
        arrOfArrBoolean[1][0] = "coding" != "programming";
        arrOfArrBoolean[1][1] = "programming" != "coding";

        System.out.println("\n" + arrOfArrBoolean[0][0]);
        System.out.println(arrOfArrBoolean[0][1]);
        System.out.println(arrOfArrBoolean[1][0]);
        System.out.println(arrOfArrBoolean[1][1]);
    }
}
