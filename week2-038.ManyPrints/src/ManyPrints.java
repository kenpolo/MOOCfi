
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        System.out.println("How many? ");
        Scanner reader = new Scanner(System.in);
        int many = Integer.parseInt(reader.nextLine());
        int i = 0;
        while (i < many) {
            printText();
            i++;
        }
    }
}
