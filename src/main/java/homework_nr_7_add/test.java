package homework_nr_7_add;

public class test {
    public static void main(String[] args) {
        TwoDimensionalShape circle1 = new Circle(23);
        TwoDimensionalShape square1 = new Square(12,34);
        ThreeDimensionalShape cube1 = new Cube(2,5,5);
        ThreeDimensionalShape shape1 = new Sphere(12);
        System.out.println(circle1);
        System.out.println(square1);
        System.out.println(cube1);
        System.out.println(shape1);
    }
}
