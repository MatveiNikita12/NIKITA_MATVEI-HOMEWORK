package homework_nr_3;

public class TemperatureConverter {
    public static void main(String[]args){
        TemperatureConverter c = new TemperatureConverter();
        TemperatureConverter f = new TemperatureConverter();
        System.out.println(f.toFahrenheit(34.56));
        System.out.println(c.toCelsius(45.6));
    }
    public double toCelsius(double fahrenheit){
        return (fahrenheit-32)/1.8;
    }
    public double toFahrenheit(double celsius){
        return celsius*1.8+32;
    }
}






