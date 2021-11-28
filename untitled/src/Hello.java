import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("What your name? ");
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        System.out.println("Hello " + name);

        scan.close();
    }
}
