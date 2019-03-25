
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

       while (true) {
    System.out.println("Type the password: ");
    String command = reader.nextLine();
    if (!command.equals("carrot")) {
        System.out.println("Wrong!");
    } else {  System.out.println("Right!\nThe secret is: jryy qbar!");
    break;
        
    }
}


    
    }
    }

