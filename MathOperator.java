public class MathOperator {
    public static void main(String[] args){
        int age = 24;
        int twoYear  = 2;
        int fourYear = 4;
        int halfOfAge = 2;
        int multiAge = 3;
        int remindOfAge = 2;

        int nextTwoYear = age + twoYear;
        int prevFourYear = age - fourYear;

        System.out.println(nextTwoYear);
        System.out.println(prevFourYear);

        // Augmented Assignment

        age /= halfOfAge;
        System.out.println(age);

        age *= multiAge;
        System.out.println(age);

        age %= remindOfAge;
        System.out.println(age);
    }
}
