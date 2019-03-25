
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what?");
        int number = Integer.parseInt(reader.nextLine());
        int result = 0;
        int i = 0;
        while (i < number) {
        i++;  
        result = result + i;
}
        System.out.println(result);
        
    }
}
