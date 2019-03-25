
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000.0;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= 2.50) {
            card.pay(2.50);
            this.economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.5) {
            this.cashInRegister += 2.5;
            this.economicalSold++;
            return cashGiven - 2.5;
        } else {
            return cashGiven;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= 4.0) {
            card.pay(4.0);
            this.gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4.0) {
            this.cashInRegister += 4.0;
            this.gourmetSold++;
            return cashGiven - 4.0;
        } else {
            return cashGiven;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
