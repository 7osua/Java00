public class NonPrimitiveDataType {
    public static void main(String[] args){
        Byte age = 127;
        Short howClose = 7_000;
        Integer howMuch = 4_400_000;
        Long howMany = 4_000_000_000_000L;
        Float howManyDigit = 444000.777F;
        Double howPercise = 444_444.777D;


        Boolean hasHobbies;
        hasHobbies = true;

        Character someCharacter = 'L';
        String someWords = "There are frog behind that hill!";

        System.out.println("Use Non primitive data type as an object :");
        System.out.println(age);
        System.out.println(howClose);
        System.out.println(howMuch);
        System.out.println(howMany);
        System.out.println(howManyDigit);
        System.out.println(howPercise);
        System.out.println(hasHobbies);
        System.out.println(someCharacter);
        System.out.println(someWords);

        age = null;
        howClose = null;
        howMuch = null;
        howMany = null;
        howManyDigit = null;
        howPercise = null;
        hasHobbies = null;
        someCharacter = null;
        someWords = null;

        System.out.println("\n" + age);
        System.out.println(howClose);
        System.out.println(howMuch);
        System.out.println(howMany);
        System.out.println(howManyDigit);
        System.out.println(howPercise);
        System.out.println(hasHobbies);
        System.out.println(someCharacter);
        System.out.println(someWords);

    }
}
