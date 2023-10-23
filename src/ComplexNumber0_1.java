public class ComplexNumber0_1 implements IPair {
    int real;
    int imagine;

    public ComplexNumber0_1() {
        this.real = 0;
        this.imagine = 0;
    }

    public ComplexNumber0_1(int real, int imaginary) {
        this.real = real;
        this.imagine = imaginary;
    }

    @Override
    public IPair add(int number) {
        ComplexNumber0_1 newNumdber = new ComplexNumber0_1(this.real, this.imagine);
        newNumdber.real += number;
        return newNumdber;
    }

    @Override
    public IPair sub(int number) {
        ComplexNumber0_1 newNumdber = new ComplexNumber0_1(this.real, this.imagine);
        newNumdber.real -= number;
        return newNumdber;
    }

    @Override
    public IPair mult(int number) {
        ComplexNumber0_1 newNumdber = new ComplexNumber0_1(this.real, this.imagine);
        newNumdber.real = newNumdber.real * number;
        newNumdber.imagine = number * newNumdber.imagine;
        return newNumdber;
    }

    @Override
    public IPair div(int number) {
        ComplexNumber0_1 newNumdber = new ComplexNumber0_1(this.real, this.imagine);
        newNumdber.real = (int) ((newNumdber.real * number) / Math.pow(number, 2));
        newNumdber.imagine = (int) (-((0 - newNumdber.imagine * number) / (Math.pow(number, 2))));
        return newNumdber;
    }

    @Override
    public String toString() {
        return real + " + " + imagine + "i";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComplexNumber0_1 other = (ComplexNumber0_1) obj;
        return this.real == other.real && this.imagine == other.imagine;
    }
}
