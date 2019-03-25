
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first word: ");
        String word = reader.nextLine();
        System.out.print("Type the second word: ");
        String word2 = reader.nextLine();
        if (word.indexOf(word2) >= 0)
        System.out.print("Result: The word '" + word2 + "' is found in the word '" + word + "'");
        else 
        { System.out.print("Result: The word '" + word2 + "' is not found in the word '" + word + "'");
            }
}
}