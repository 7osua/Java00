public class BlockCode {
    // Block have one or more statement
    // Block code is containt code inside open-closing curly brackets
    // "{" and "}"

    // inside "class" block
    // outside "main" method block
    public static void main (String[] args) {

        // inside "main" method block
        // outside "for" looping block
        int currentCounter = 0;
        for (int incCounter = 0; currentCounter != 8; ++currentCounter) {

            // inside "for" looping block
            System.out.println(incCounter);
            incCounter += 1;

        }

        {
            System.out.print("Hello \t");
            System.out.print("Josua \t");
            System.out.print("Manullang \t");
        }
    }
}
