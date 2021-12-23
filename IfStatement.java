public class IfStatement {
    public static void main (String[] args) {

        String firstName = "Josua";
        String lastName = "Manullang";

        if(firstName == "Josua" && lastName == "Manullang") {
            String josuaItSelf = firstName + " " + lastName;
            System.out.println(josuaItSelf);
        }

        byte valOfByte = 127;
        if (valOfByte > -128 || valOfByte < 128 ) {
            System.out.println("Val caontaint inside the range range of byte,\nmax is up to 127\n min is down to -127");
        }

        boolean codeAsHobby = true;
        boolean devAsLife = true;
        String someWord = "It\'s all about solve the problem,\n Provide solution in real life. ";
        if(codeAsHobby && devAsLife || someWord != null || someWord != "") {
            System.out.println(
                    firstName +
                    ", like to code and want to be a developer.\nBoth is true\nHere some of the word He say :\n" +
                    someWord
            );
        }


    }
}
