public class Money extends Pair {

    @Override
    public Pair add(int number) {
        Money newMoney = this;
        newMoney.a += number;
        return newMoney;
    }

    @Override
    public Pair sub(int number) {
        Money newMoney = this;
        newMoney.a -= number;
        return newMoney;
    }

    @Override
    public Pair mult(int number) {
        Money newMoney = this;
        newMoney.a *= number;
        newMoney.a += (newMoney.b * number) / 100;
        newMoney.b = (newMoney.b * number) % 100;
        return newMoney;
    }

    @Override
    public Pair dev(int number) {
        Money newMoney = this;
        double temp = newMoney.a;
        temp += (double) newMoney.b / 100;
        temp /= number;
        newMoney.a = (int) temp;
        newMoney.b = (int) (temp % 1) % 100;
        return newMoney;
    }
}
