public class BasicArrayOperation {
    public static void main(String[] args){

        String[] someString = new String[4];

        // Add values to array
        someString[0] = "I";
        someString[1] = "Love";
        someString[2] = "Java";
        someString[3] = "But It Sucks Too";

        // Change Value in an array
        someString[2] += " & JavaScript";

        // Remove or delete a value in an array
        someString[3] = null;

        System.out.println(someString[0]);
        System.out.println(someString[1]);
        System.out.println(someString[2]);
        System.out.println(someString[3]);
        System.out.println(someString.length);

        Character[] someChar = {'J', 'o', 's', 'u', 'a'};

        // change a value in an array of char
        someChar[1] = 'O';
        someChar[2] = 'S';
        someChar[3] = 'U';
        someChar[4] = 'A';

        // delete 2 values in an array of char
        someChar[3] = null;
        someChar[4] = null;

        System.out.print(someChar[0]);
        System.out.print(someChar[1]);
        System.out.print(someChar[2] + "\n");
        System.out.println(someChar[3]);
        System.out.println(someChar[4]);
        System.out.print(someChar.length);

        Byte[] someByte = {1,2,7,127, 0};

        someByte[0] = 12;
        someByte[1]  = 27;
        someByte[2] = -128;
        someByte[3] = -1;

        System.out.println(someByte[0]);
        System.out.println(someByte[1]);
        System.out.println(someByte[2]);
        System.out.println(someByte[3]);

        Short[] someShort = {120, 1_200, 12_000};

        someShort[0] = 127;
        someShort[1] = 1_277;
        someShort[2] = null;

        System.out.println(someShort[0]);
        System.out.println(someShort[1]);
        System.out.println(someShort[2]);

        Integer[] someInteger = { 11, 222, 444, 7777 };

        someInteger[0] *= 2;
        someInteger[1] += 555;
        someInteger[2] -= 222;
        someInteger[3] /= 3;

        System.out.println(someInteger[0]);
        System.out.println(someInteger[1]);
        System.out.println(someInteger[2]);
        System.out.println(someInteger[3]);

        Long[] someLong = { 22L, 33L, 444L};

        someLong[0] *= 2;
        someLong[1] += someLong[0];
        someLong[2] = null;

        System.out.println(someLong[0]);
        System.out.println(someLong[1]);
        System.out.println(someLong[2]);

        Float[] someFloat = {22.4F, 24.6F, 25.5F, 25.5F};

        someFloat[0] += someFloat[1];
        someFloat[2] += someFloat[3];
        someFloat[3] = null;

        System.out.println(someFloat[0]);
        System.out.println(someFloat[1]);
        System.out.println(someFloat[2]);
        System.out.println(someFloat[3]);

        Double[] someDouble = { 444D, 333D, 555D};

        someDouble[0] /= 2.0;
        someDouble[1] += 111D;
        someDouble[2] -= someDouble[1];

        System.out.println(someDouble[0]);
        System.out.println(someDouble[1]);
        System.out.println(someDouble[2]);

        Boolean[] someBoolean = {true, true, false, false};

        someBoolean[0] = someBoolean[2] == someBoolean[3] ? false : true;
        someBoolean[1] = 2 < 3;
        someBoolean[2] = 4 + 4 < 4 -5;
        someBoolean[3] = 2/2 >= 1;

        System.out.println(someBoolean[0]);
        System.out.println(someBoolean[1]);
        System.out.println(someBoolean[2]);
        System.out.println(someBoolean[3]);

    }
}
