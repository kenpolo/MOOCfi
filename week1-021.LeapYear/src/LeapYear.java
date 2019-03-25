
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        boolean remain4 = (year % 4) == 0;
        boolean remain100 = (year % 100) != 0;
        boolean remain400 = ((year % 100 == 0) && (year % 400 == 0));;
        
         if ((remain4 && (remain100 || remain400 ))) {
             System.out.println("The year is a leap year");
        
        }   else {
             System.out.println("The year is not a leap year.");
    }
}
    }
