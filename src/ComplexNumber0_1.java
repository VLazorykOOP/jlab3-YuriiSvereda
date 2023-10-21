public class ComplexNumber0_1 implements IPair{
    int real;
    int imagine;
    @Override
    public IPair add(int number) {
        ComplexNumber0_1 newNumdber = this;
        newNumdber.real+=number;
        return newNumdber;
    }

    @Override
    public IPair sub(int number) {
        ComplexNumber0_1 newNumdber = this;
        newNumdber.real-=number;
        return newNumdber;
    }

    @Override
    public IPair mult(int number) {
        ComplexNumber0_1 newNumdber = this;
        newNumdber.real = newNumdber.real * number;
        newNumdber.imagine = number * newNumdber.imagine;
        return newNumdber;
    }

    @Override
    public IPair dev(int number) {
        ComplexNumber0_1 newNumdber = this;
        newNumdber.real = (int)((newNumdber.real * number) / Math.pow(number, 2));
        newNumdber.imagine = (int)(-((0 - newNumdber.imagine * number) / (Math.pow(number, 2) )));
        return newNumdber;
    }
}
