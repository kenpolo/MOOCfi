import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        int number;
        int sum = 0;
        int numbersTyped = 0;
        double average = 0.0;
        int even = 0;
        int odd = 0;

        while (true) {
        number = Integer.parseInt(reader.nextLine());
        if (number == -1){
            
            System.out.println("Thank you and see you later!");
            System.out.println("The sum is: " + sum);
            System.out.println("Average: " + average);
            System.out.println("How many numbers: " + numbersTyped);
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers " + odd);
            break;
        }
            if (number >= 0){
            numbersTyped++;
            sum += number;
            average = sum / (1.0 * numbersTyped);
            } if (number > 0 && number%2 == 0) {
              even++;
            } if (number >= 1 && number%2 !=0)  {
              odd++;
            
                
        

    
    

        
        

    
}
}
}   
}