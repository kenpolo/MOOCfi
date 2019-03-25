import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Please type in your name: ");
        String name = reader.nextLine();
        int length = name.length();
        int i = length - 1;
        int charNum = 0;
        
            System.out.print("In reverse order: ");
            
            while (i >= 0) {  
            System.out.print(name.charAt(i));
            i--;
            
    }
}   
    }
