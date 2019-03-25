
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
      
        System.out.println("First: ");
           int number1 = Integer.parseInt(reader.nextLine());
           System.out.println("Last: ");
           int number2 = Integer.parseInt(reader.nextLine());
           int result = number1;
                int i = number1;
                 while (i < number2) {
        i++;  
        result = result + i;
}
        System.out.println(result);
           
        
          
        
    }
}
    