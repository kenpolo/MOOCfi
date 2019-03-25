
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int remain = number%2;
        if (remain == 0 ) {
             System.out.println("Number " + number + " is even.");
        } else {
             System.out.println("Number " + number + " is odd.");
             
        
        

    }
}
    }
