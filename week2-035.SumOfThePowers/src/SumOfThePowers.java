
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int result = 1;
        int i = 0;
        while (i < number) {
        i++;  
        result = result + (int)Math.pow(2, i);
        
        
}
        
        System.out.println("The result is " + result);
    }
}
