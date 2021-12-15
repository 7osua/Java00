public class ArrayDataType {
    public static void main(String[] args){

        Character[] someCharacter = new Character[5];
        someCharacter[0] = 'J';
        someCharacter[1] = 'o';
        someCharacter[2] = 's';
        someCharacter[3] = 'u';
        someCharacter[4] = 'a';

        String[] someWords = new String[3];
        someWords[0] = "I";
        someWords[1] = "Love";
        someWords[2] = "Java";

        Boolean[] someBool = new Boolean[2];
        someBool[0] = true;
        someBool[1] = false;

        Byte[] someByte = new Byte[4];
        someByte[0] = 127;
        someByte[1] = 128 - 2;
        someByte[2] = 129 - 4;
        someByte[3] = 130 - 6;

        Integer[] someInteger = new Integer[2];
        someInteger[0] = 4_400_000;
        someInteger[1] = 7_700_000;

        Long[] someLong = new Long[3];
        someLong[0] = 127_000_000L;
        someLong[1] = 127_000_000_127L;
        someLong[2] = 127_127_127_000L;

        Float[] someFloat = new Float[4];
        someFloat[0] = 4.4F;
        someFloat[1] = 2.47F;
        someFloat[2] = 222.47F;
        someFloat[3] = 224477.247247F;

        Double[] someDouble = new Double[2];
        someDouble[0] = 3.45D;
        someDouble[1] = 44444444.444D;

        // Array Initlializer
        Character[] initArrOfChar = new Character[]{'A', 'B', 'a', 'b'};
        Character[] initAnotherChar = {'a', 'b', 'c', 'd'};

        String[] initArrOfString = new String[]{"I", "Love", "Programming"};
        String[] initAnotherString = {"Learning", "By", "Doing"};

        Boolean[] initArrOfBoolean = new Boolean[]{true, true, false, false};
        Boolean[] initAnotherBoolean = {true, true, true, true};

        Byte[] initArrOfByte = new Byte[]{127, 126, -128, -27};
        Byte[] initAnotherByte = {120, 124, 123, 125};

        Short[] initArrOfShort = new Short[] {32000, 1700, 230};
        Short[] initAnotherShort = {3_333, 44_44, 55_5};

        Integer[] initArrOfInteger = new Integer[]{4_400_000, 7_700_000, 9_900_000, 2_000_000_000};
        Integer[] initAnotherInteger = { 3_300_000, 5_500_000, 4_000_000, 30};

        Long[] initArrOfLong = new Long[]{3_400_000L, 2_500_000L, 4_400_000L};
        Long[] initAnotherLong = {2200L, 3000L, 4000L};

        Float[] initArrOfFloat = new Float[]{22.3f, 444.444F, 7700.0247F};
        Float[] initAnotherFloat = {24.0F, 222222.0F, 255.5555F};

        Double[] initArrOfDouble = new Double[]{345D, 277.44D, 744.247D};
        Double[] initAnotherDouble = {247.247D, 444.444D, 777.777D};

        for(byte index = 0; index < someWords.length; index++){
            System.out.println(someWords[index]);
        }

        for(byte index = 0; index < someCharacter.length; index++) {
            System.out.println(someCharacter[index]);
        }

        for(byte index = 0; index < someBool.length; index++) {
            System.out.println(someBool[index]);
        }

        for(byte index = 0; index < someByte.length; index++) {
            System.out.println(someByte[index]);
        }

        for(byte index = 0; index < someInteger.length; index++) {
            System.out.println(someInteger[index]);
        }

        for(byte index = 0; index < someLong.length; index++) {
            System.out.println(someLong[index]);
        }

        for(byte index = 0; index  < someFloat.length; index++) {
            System.out.println(someFloat[index]);
        }

        for(byte index = 0; index < someDouble.length; index++) {
            System.out.println(someDouble[index]);
        }

        //  Show array initializer

        for(byte index = 0; index < initArrOfChar.length; index++) {
            System.out.println(initArrOfChar[index]);
        }

        for(byte index = 0; index < initAnotherChar.length; index++) {
            System.out.println(initAnotherChar[index]);
        }

        for(byte index = 0; index < initArrOfString.length; index++) {
            System.out.println(initArrOfString[index]);
        }

        for(byte index = 0; index < initAnotherString.length; index++) {
            System.out.println(initAnotherString[index]);
        }

        for(byte index = 0; index < initArrOfBoolean.length; index++) {
            System.out.println(initArrOfBoolean[index]);
        }

        for(byte index = 0; index < initAnotherBoolean.length; index++) {
            System.out.println(initAnotherBoolean[index]);
        }

        for(byte index = 0; index < initArrOfByte.length; index++) {
            System.out.println(initArrOfByte[index]);
        }

        for(byte index = 0; index < initAnotherByte.length; index++) {
            System.out.println(initAnotherByte[index]);
        }

        for(byte index = 0; index < initArrOfShort.length; index++) {
            System.out.println(initArrOfByte[index]);
        }

        for(byte index = 0; index < initAnotherShort.length; index++) {
            System.out.println(initAnotherByte[index]);
        }

        for(byte index = 0; index < initArrOfInteger.length; index++) {
            System.out.println(initArrOfInteger[index]);
        }

        for(byte index = 0; index < initAnotherInteger.length; index++) {
            System.out.println(initAnotherInteger[index]);
        }

        for(byte index = 0; index < initArrOfLong.length; index++) {
            System.out.println(initArrOfInteger[index]);
        }

        for(byte index = 0; index < initAnotherLong.length; index++) {
            System.out.println(initAnotherInteger[index]);
        }

        for(byte index = 0; index < initArrOfFloat.length; index++) {
            System.out.println(initArrOfFloat[index]);
        }

        for(byte index = 0; index < initAnotherFloat.length; index++) {
            System.out.println(initAnotherFloat[index]);
        }

        for(byte index = 0; index < initArrOfDouble.length; index++) {
            System.out.println(initArrOfFloat[index]);
        }

        for(byte index = 0; index < initAnotherDouble.length; index++) {
            System.out.println(initAnotherFloat[index]);
        }
    }
}
