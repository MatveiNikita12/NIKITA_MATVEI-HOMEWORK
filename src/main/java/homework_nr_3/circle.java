package homework_nr_3;

public class circle {
    public static void main(String[] args){
        Radius radius1 = new Radius(3.7);
        radius1.calculateArea();

    }
}
class Radius{
    double radius;
    void calculateArea(){
         System.out.println(3.14*radius*radius);
    }



    public Radius(double radius) {
        this.radius = radius;
    }
}




