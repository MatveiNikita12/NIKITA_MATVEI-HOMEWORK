package homework_nr_7_add;

public class Cube extends ThreeDimensionalShape{
    public double high;
    public double length;
    public double width;

    public Cube(double high, double length, double width) {
        this.high = high;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return high*length*width;
    }
}
