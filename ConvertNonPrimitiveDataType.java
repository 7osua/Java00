public class ConvertNonPrimitiveDataType {
    public static void main(String[] args){
        byte initByte = 127;
        short initShort = 12_700;
        int initInt = 127_000_000;
        long initLong = 127_000_000_000L;
        float initFloat = 127_000_000.05F;
        double initDouble = 127_000_000_000.9999F;

        boolean initBoolean = true;
        char initChar = '7';

        // convert to non-primitive data type
        Byte initByte01 = initByte;
        Integer initByte02 = initByte + initShort;

        System.out.println(initByte);
        System.out.println(initByte01);
        System.out.println(initByte02);
        System.out.println(initByte01.shortValue());
        System.out.println(initByte01.intValue());
        System.out.println(initByte01.longValue());
        System.out.println(initByte01.floatValue());
        System.out.println(initByte01.doubleValue());
        System.out.println(initByte01.toString());

        Double initDouble01 = initDouble;
        System.out.println("\n" + initDouble01);
        System.out.println(initDouble01.byteValue());
        System.out.println(initDouble01.shortValue());
        System.out.println(initDouble01.intValue());
        System.out.println(initDouble01.longValue());
        System.out.println(initDouble01.floatValue());
        System.out.println(initDouble01.toString());


        Boolean initBoolean01 = initBoolean;
        System.out.println("\n" + initBoolean);
        System.out.println(initBoolean01);
        System.out.println(initBoolean01.toString());

        Character initChar01 = initChar;
        System.out.println("\n" + initChar01);
        System.out.println(initChar01.toString());

        String someWords = "I love Java";
        System.out.println("\n" + someWords);
        System.out.println(someWords.toLowerCase());
        System.out.println(someWords.toUpperCase());
    }
}
