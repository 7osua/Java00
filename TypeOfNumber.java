public class TypeOfNumber {
    public static void main(String[] args){

        // Integer Number
        byte initByte = 100;
        short initShort = 1_000; // 1000
        int initInteger = 1_000_000; //1000000
        long initLong = 1_000_000_000_000L; //1000000000000L

        System.out.println("\nInteger Number :");
        System.out.println(initByte);
        System.out.println(initShort);
        System.out.println(initInteger);
        System.out.println(initLong);

        // Floating point Number
        float initFloat = 1_000_000_000.000_5F; //1000000000.0005F
        double initDouble = 1_000_000_000_000.000_5; //1000000000000.0005

        System.out.println("\nFloating Point Number :");
        System.out.println(initFloat);
        System.out.println(initDouble);

        // Literals Number
        int decInt = 24;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        System.out.println("\nLiterals Number :");
        System.out.println(decInt);
        System.out.println(hexInt);
        System.out.println(binInt);

    }
}
