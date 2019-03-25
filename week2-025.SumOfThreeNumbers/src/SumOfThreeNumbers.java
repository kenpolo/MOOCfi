
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number:");
        int read = Integer.parseInt(reader.nextLine()); // store numbers read form user in this variable
        System.out.println("Type the second number:");
        read = read + Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number:");
        read = read + Integer.parseInt(reader.nextLine());
        int sum = read;
        

        System.out.println("Sum: " + sum);
    }
}
