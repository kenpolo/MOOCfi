
public class Accounts {

    public static void main(String[] args) {
        Account A = new Account("A's account",100.00);
        Account B = new Account("B's account",0);
        Account C = new Account("C's account",0);
        transfer(A,B,50.00);
        transfer(B,C,25.00);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

    public static void transfer(Account from, Account to, double howMuch) {
    from.withdrawal(howMuch);
    to.deposit(howMuch);
    }
}
