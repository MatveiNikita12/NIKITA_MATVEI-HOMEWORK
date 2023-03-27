package homework_nr_3;

public class TemperatureConverter {
    public static void main(String[]args){

        float f = toFahrenheit(32);
        float c = toCelsius(234);

        System.out.println(f +" "+c);
    }
    public static float toCelsius( float fahrenheit){
        return (float)((fahrenheit-32)/1.8);
    }
    public static float toFahrenheit(float celsius){
        return (float)(celsius*1.8+32);
    }

}
