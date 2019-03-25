
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account kenwardAccount = new Account("Kenward's account",100.00);
        kenwardAccount.deposit(20);
        System.out.println("Kenward's account balance is now: "+kenwardAccount);
    }

}
