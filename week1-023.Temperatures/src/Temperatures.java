
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
    System.out.println("Add a temperature value: ");
    double value = Double.parseDouble(reader.nextLine());
    
    boolean temp = (value > 40);
    boolean temp2 = (value < -30);
            
         if (!temp && !temp2) {
             Graph.addNumber(value);
         }
             
    }
}


    
    }
    

        
    
     
 
        // Remove or comment out these lines above before trying to run the tests.
    

    
    
