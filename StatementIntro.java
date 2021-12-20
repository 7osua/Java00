public class StatementIntro {
    public static void main (String[] args) {
        // A statement ended with semicolon ";"
        // Expression is part and can say it as a statement.
        // But an expression not mean to be a statement.

        // assignment statement
        double aDoubleValue = 3.14D;

        // decrement statement;
        --aDoubleValue;

        // Method invocation statement
        int anIntValue = (int) Math.floor(aDoubleValue);
        System.out.println(anIntValue);

        // Object creation statement
        String aStringObject = new String();
    }
}
