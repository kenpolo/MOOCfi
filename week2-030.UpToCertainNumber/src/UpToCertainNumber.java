
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number? ");
           int numberLimit = Integer.parseInt(reader.nextLine());
           int number = 1;
        
            while (number <= numberLimit) {
        System.out.println(number);
        number++;  // number++ means the same as number = number + 1
        
    }
}
    }