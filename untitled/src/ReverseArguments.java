import java.util.Scanner;

public class ReverseArguments {
    public static void main(String[] args) {

        System.out.println("Enter a string ");
        Scanner scan = new Scanner(System.in);


            StringBuilder str = new StringBuilder(scan.nextLine());
            str.reverse();
            System.out.println("Your string - " + str);

    }
}
