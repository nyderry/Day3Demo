import java.util.Scanner;

/**
 * Created by Ny Derry on 6/28/2017. Template for user to continue.
 */
public class WhileLoopEx {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String choice = "y";

        while (choice.equalsIgnoreCase( "y")) {

            //get some input from the user and do some stuff

            System.out.println("Continue? (y/n)");
            choice = scan.nextLine();
        }
        System.out.println("Goodbye");
    }
}
