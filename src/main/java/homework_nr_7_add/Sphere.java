package homework_nr_7_add;

public class Sphere extends ThreeDimensionalShape{
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return (4/3)*3.14*(Math.pow(radius,3));
    }
}
