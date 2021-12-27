import java.time.Clock;

public class SwitchStatement {
    public static void main (String[] args) {
        int dayByNumber = 7;

        switch(dayByNumber) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jum'at");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Hanya ada 7 hari");
                break;
        }

        switch(dayByNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
                System.out.println("Hari ganjil");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("Hari genap");
                break;
            default:
                System.out.println("Hanya ada hari\nke 1 s/d ke 7");
        }
    }
}
