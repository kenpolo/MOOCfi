
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word:");
        String word = reader.nextLine();
        System.out.print("Length of the first part: ");
        int part = reader.nextInt();
        System.out.print("Result: " + word.substring(0,part));
    }
}
