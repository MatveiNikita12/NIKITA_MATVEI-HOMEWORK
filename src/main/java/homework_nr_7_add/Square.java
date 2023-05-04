package homework_nr_7_add;

public class Square extends TwoDimensionalShape{
    public double high;
    public double length;

    public Square(double high, double length) {
        this.high = high;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return high*length;
    }
}
