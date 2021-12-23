public class Variable {
    public static void main(String[] args){
        String fullName = "Josua" + " " + "Manullang";
        char gender = 'M';
        boolean hasJob = false;
        boolean isBusy = true;
        int startSalaryExpect = 4_400_000;
        short age = 24;
        float height = 177.7F;
        int hexFavColor = 0x212529;
        String currentPlace = "WMX";
        String somethingToLog = "Java + JavaScript is Awesome !!!";

        System.out.print("Variable  :\n");
        System.out.println(fullName);
        System.out.println(gender);
        System.out.println(hasJob);
        System.out.println(isBusy);
        System.out.println(startSalaryExpect);
        System.out.println(age);
        System.out.println(hexFavColor);

        System.out.println(currentPlace);
        currentPlace = "YK";
        System.out.println(currentPlace);

        System.out.println(somethingToLog);
    }
}
