
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        
        String help = "";
        int length = text.length();
        int i = length - 1;
        while (i >= 0) {  
        help = help + text.charAt(i);
        i--;
    }
        return help;
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
