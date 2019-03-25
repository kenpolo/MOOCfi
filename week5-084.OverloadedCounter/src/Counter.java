
public class Counter {

    int startingValue;
    int value;
    boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
        this.value = startingValue;
    }

    public Counter(int startingValue) {
        this.startingValue = startingValue;
        this.value = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.startingValue = 0;
        this.check = check;
        this.value = startingValue;
    }

    public Counter() {
        this.startingValue = 0;
        this.value = startingValue;
        this.check = false;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            //do nothing
        } else {
            if (this.check == true) {
                this.value -= decreaseAmount;

                if (this.value < 0) {
                    this.value = 0;
                }
            } else {
                this.value -= decreaseAmount;
            }

        }
    }
}
