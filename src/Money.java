public class Money extends Pair {

    public Money() {
        this.a = 0;
        this.b = 0;
    }

    public Money(int bills, int kopecks) {
        this.a = bills;
        this.b = kopecks;
    }

    @Override
    public Pair add(int number) {
        Money newMoney = new Money(this.a, this.b);
        newMoney.a += number;
        return newMoney;
    }

    @Override
    public Pair sub(int number) {
        Money newMoney = new Money(this.a, this.b);
        newMoney.a -= number;
        return newMoney;
    }

    @Override
    public Pair mult(int number) {
        Money newMoney = new Money(this.a, this.b);
        newMoney.a *= number;
        newMoney.a += (newMoney.b * number) / 100;
        newMoney.b = (newMoney.b * number) % 100;
        return newMoney;
    }

    @Override
    public Pair div(int number) {
        Money newMoney = new Money(this.a, this.b);
        double temp = newMoney.a;
        temp += (double) newMoney.b / 100;
        temp /= number;
        newMoney.a = (int) temp;
        newMoney.b = (int) (temp % 1) % 100;
        return newMoney;
    }

    @Override
    public String toString() {
        return String.format("%d.%02d", a, b);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Money money = (Money) other;

        if (a != money.a) return false;
        return b == money.b;
    }
}
