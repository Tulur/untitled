import javax.swing.plaf.synth.SynthDesktopIconUI;

public class InchesToMeters {
    public static void main(String[] args) {
        double inches, meters;

        int counter = 0;
        int feet = 144;
        // в 12 футах 144 дюйма
        for (inches = 1; inches <= 144; inches++) {
            meters = inches * 39.37;
            System.out.println(inches + " дюймам соответствует " + meters + " метрам.");

            feet--;
            System.out.println("До 12 футов осталось: " + feet + "дюйма");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
