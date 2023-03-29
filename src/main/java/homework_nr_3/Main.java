package homework_nr_3;

public class Main {
    public static void main(String[] args){
        Radius radius2 = new Radius(2.43);
        radius2.calculateArea();
        TemperatureConverter c = new TemperatureConverter();
        TemperatureConverter f = new TemperatureConverter();
        System.out.println(f.toFahrenheit(56));
        System.out.println(c.toCelsius(342.5));

    }
}
