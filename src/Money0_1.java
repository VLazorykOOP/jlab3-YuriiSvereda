public class Money0_1 implements IPair {
    int bills;
    int kopecks;

    public Money0_1() {
        this.bills = 0;
        this.kopecks = 0;
    }

    public Money0_1(int bills, int kopecks) {
        this.bills = bills;
        this.kopecks = kopecks;
    }

    @Override
    public IPair add(int number) {
        Money0_1 newMoney = new Money0_1(this.bills, this.kopecks);
        newMoney.bills += number;
        return newMoney;
    }

    @Override
    public IPair sub(int number) {
        Money0_1 newMoney = new Money0_1(this.bills, this.kopecks);
        newMoney.bills -= number;
        return newMoney;
    }

    @Override
    public IPair mult(int number) {
        Money0_1 newMoney = new Money0_1(this.bills, this.kopecks);
        newMoney.bills *= number;
        newMoney.bills += (newMoney.kopecks * number) / 100;
        newMoney.kopecks = (newMoney.kopecks * number) % 100;
        return newMoney;
    }

    @Override
    public IPair div(int number) {
        Money0_1 newMoney = new Money0_1(this.bills, this.kopecks);
        double temp = newMoney.bills;
        temp += (double) newMoney.kopecks / 100;
        temp /= number;
        newMoney.bills = (int) temp;
        newMoney.kopecks = (int) (temp % 1) % 100;
        return newMoney;
    }

    @Override
    public String toString() {
        return String.format("%d.%02d", bills, kopecks);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Money0_1 money = (Money0_1) other;

        if (bills != money.bills) return false;
        return kopecks == money.kopecks;
    }
}
