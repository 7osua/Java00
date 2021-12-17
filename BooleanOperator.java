public class BooleanOperator {
    public static void main(String[] args) {
        byte currentAge = 24;
        char gender = 'M';
        boolean hasHobby = true;

        boolean isAnAdult = currentAge >= 18;
        boolean isMale = gender == 'M';
        boolean isOutdoorActivity = hasHobby;

        boolean adultAndOutsider = isAnAdult && isOutdoorActivity;
        boolean underAgeButOutsider = !isAnAdult || isOutdoorActivity;
        boolean underAgeMaleButOutsider = isAnAdult && isMale || isOutdoorActivity;

        System.out.println(adultAndOutsider);
        System.out.println(underAgeButOutsider);
        System.out.println(underAgeMaleHateOutsider);
    }
}
