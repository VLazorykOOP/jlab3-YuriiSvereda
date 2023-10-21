public class Money0_1 implements IPair {
    int bills;
    int kopecks;

    @Override
    public IPair add(int number) {
        Money0_1 newMoney = this;
        newMoney.bills += number;
        return newMoney;
    }

    @Override
    public IPair sub(int number) {
        Money0_1 newMoney = this;
        newMoney.bills -= number;
        return newMoney;
    }

    @Override
    public IPair mult(int number) {
        Money0_1 newMoney = this;
        newMoney.bills *= number;
        newMoney.bills += (newMoney.kopecks * number) / 100;
        newMoney.kopecks = (newMoney.kopecks * number) % 100;
        return newMoney;
    }

    @Override
    public IPair dev(int number) {
        Money0_1 newMoney = this;
        double temp = newMoney.bills;
        temp += (double) newMoney.kopecks / 100;
        temp /= number;
        newMoney.bills = (int) temp;
        newMoney.kopecks = (int) (temp % 1) % 100;
        return newMoney;
    }
}
