public class ElseIfStatement {
    public static void main(String[] args) {

        int experienceInYears = 0;
        int companies = 0;
        boolean isAnExpert = false;
        char typeOfSex = 'F';
        String firstName = "Josev";
        String statusNow = null;


        isAnExpert = true;
        if(typeOfSex == 'M' ) {
            statusNow = "Mr. ";
        } else if ( typeOfSex == 'F' ) {
            statusNow = "Ms. ";
        }

        statusNow += firstName;

        if ( experienceInYears > 4 && companies > 4) {
            statusNow += ", is a senior level.\nGot a lot of experience.";
        } else if (experienceInYears > 2 && companies > 2) {
            statusNow += ", is a middle level,\nGot a lot of potential in the future.";
        } else if (experienceInYears >= 1 && companies >= 1) {
            statusNow += ", is an junior level,\nGot a fresh baby leader in progress.";
        } else {
            statusNow += ", is a learner, need a shot and\nneed place to improve intensively.\nBetter keep it.";
        }


        System.out.println(statusNow);
    }
}
