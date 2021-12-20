import java.util.Scanner;

public class GravityOnTheMoon {
    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int gravity = 17; // On moon 17% gravity from Earth

        int weighOnMoon = number * gravity / 100;

        System.out.println("Your weight on the moon: " + weighOnMoon);

    }
}
