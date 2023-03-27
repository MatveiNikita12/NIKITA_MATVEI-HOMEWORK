package homework_nr_3;

public class circle {
    public static void main(String[] args){
        float radius;
        radius = calculateArea(23);
        System.out.println(radius);

    }

    public static float calculateArea(float x){
        return (float) (3.14*x*x);
    }
}

