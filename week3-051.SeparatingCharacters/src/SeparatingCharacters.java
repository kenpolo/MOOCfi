
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please type in your name: ");
        String name = reader.nextLine();
        int length = name.length();
        int i = 0;
        int charNum = 0;
        
        while (i < length) {
            System.out.println((charNum+1) + ". character: " + name.charAt(i));
            i++;
            charNum++;
            
        }
    }
}
    