public class NumberConvertion {
    public static void main (String[] args){
        // Number Type Convertion : Widening Casting & Narrowing Casting
        // Widening Casting (Auto)
        // byte -> short -> int -> long -> float -> double
        byte valOfByte = 24;
        short valOfShort = valOfByte;
        int valOfInt = valOfShort;
        long valOfLong = valOfInt;
        float valOfFloat = valOfLong;
        double valOfDouble = valOfFloat;

        System.out.println("\nWidening Casting (byte -> double):");
        System.out.println(valOfByte);
        System.out.println(valOfShort);
        System.out.println(valOfInt);
        System.out.println(valOfLong);
        System.out.println(valOfFloat);
        System.out.println(valOfDouble);

        // Narrowing Casting (Manual)
        // double -> float -> long -> int -> short -> byte
        valOfDouble = 127.0;
        valOfFloat = (float) valOfDouble;
        valOfLong = (long) valOfFloat;
        valOfInt = (int) valOfLong;
        valOfShort = (short) valOfInt;
        valOfByte = (byte) valOfShort;

        System.out.println("\nNarrowing Casting (double -> byte):");
        System.out.println(valOfByte);
        System.out.println(valOfShort);
        System.out.println(valOfInt);
        System.out.println(valOfLong);
        System.out.println(valOfFloat);
        System.out.println(valOfDouble);

        // Number Overflow
        // if current data type or the current variable value is bigger then
        // the new data type can't contain.
        // Or the new variable value data type is smaller then
        // the current variable data type can't containt.
        short valWillBeOverFlow = 129;
        byte valReceiveTheOverFlow = (byte) valWillBeOverFlow;
        System.out.println("Number OverFlow :");
        System.out.println(valWillBeOverFlow);
        System.out.println(valReceiveTheOverFlow);

    }
}
