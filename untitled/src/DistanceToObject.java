import java.util.Scanner;

public class DistanceToObject {
    public static void main(String[] args) {
        double dist;
        double soundSpeed = 340; // approximate speed of sound in air under normal conditions in meters

        System.out.println("How many seconds did the sound return? ");
        Scanner scan = new Scanner(System.in);
        double seconds = scan.nextDouble();

        dist = (soundSpeed * seconds) / 2;

        System.out.println("To the object " + dist + " meters");
    }
}
