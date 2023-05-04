package homework_nr_7_add;

public class Circle extends TwoDimensionalShape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return 3.14*(Math.pow(radius,2));
    }

}



