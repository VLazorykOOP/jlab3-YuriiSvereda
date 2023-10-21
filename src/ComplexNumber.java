public class ComplexNumber extends Pair{
    @Override
    public Pair add(int number) {
        ComplexNumber newNumdber = this;
        newNumdber.a+=number;
        return newNumdber;
    }

    @Override
    public Pair sub(int number) {
        ComplexNumber newNumdber = this;
        newNumdber.a-=number;
        return newNumdber;
    }

    @Override
    public Pair mult(int number) {
        ComplexNumber newNumdber = this;
        newNumdber.a = newNumdber.a * number;
        newNumdber.b = number * newNumdber.b;
        return newNumdber;
    }

    @Override
    public Pair dev(int number) {
        ComplexNumber newNumdber = this;
        newNumdber.a = (int)((newNumdber.a * number) / Math.pow(number, 2));
        newNumdber.b = (int)(-((0 - newNumdber.b * number) / (Math.pow(number, 2) )));
        return newNumdber;
    }
}
