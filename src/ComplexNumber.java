public class ComplexNumber extends Pair {

    public ComplexNumber() {
        this.a = 0;
        this.b = 0;
    }

    public ComplexNumber(int real, int imaginary) {
        this.a = real;
        this.b = imaginary;
    }

    @Override
    public Pair add(int number) {
        ComplexNumber newNumdber = new ComplexNumber(this.a, this.b);
        newNumdber.a += number;
        return newNumdber;
    }

    @Override
    public Pair sub(int number) {
        ComplexNumber newNumdber = new ComplexNumber(this.a, this.b);
        newNumdber.a -= number;
        return newNumdber;
    }

    @Override
    public Pair mult(int number) {
        ComplexNumber newNumdber = new ComplexNumber(this.a, this.b);
        newNumdber.a = newNumdber.a * number;
        newNumdber.b = number * newNumdber.b;
        return newNumdber;
    }

    @Override
    public Pair div(int number) {
        ComplexNumber newNumdber = new ComplexNumber(this.a, this.b);
        newNumdber.a = (int) ((newNumdber.a * number) / Math.pow(number, 2));
        newNumdber.b = (int) (-((0 - newNumdber.b * number) / (Math.pow(number, 2))));
        return newNumdber;
    }

    @Override
    public String toString() {
        return a + " + " + b + "i";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComplexNumber other = (ComplexNumber) obj;
        return this.a == other.a && this.b == other.b;
    }
}
