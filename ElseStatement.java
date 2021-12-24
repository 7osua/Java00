public class ElseStatement {
    public static void main (String[] args) {
        int ageNow = 24;
        boolean hasMarried = false;
        String fullName = "Josua Manullang";
        String statusNow = fullName;

        if ( ageNow >= 18 ) {
            if ( !hasMarried ) {
                statusNow += ", remind un-married!";
            }
            else {
                statusNow += ", already married!";
            }
        }

        else {
            statusNow += ", an still a teenager";
        }

        System.out.println(statusNow);
    }
}
