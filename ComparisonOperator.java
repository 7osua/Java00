public class ComparisonOperator {
    public static void main(String[] args){
        byte ageNow = 24;
        char favChar = '7';
        boolean isSingle = true;
        String gender = "Male";

        System.out.println(ageNow == 24);
        System.out.println(ageNow > 24);
        System.out.println(ageNow < 24);
        System.out.println(ageNow >= 24);
        System.out.println(ageNow <= 24);

        System.out.println(isSingle == true);
        System.out.println(!isSingle);
        System.out.println(gender != "Female");
    }
}
