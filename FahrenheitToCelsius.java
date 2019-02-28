package Capitulo2.Ejercicios;

/*
Write a program that accepts a temperature in Fahrenheit from a user and converts
it to Celsius by subtracting 32 from the Fahrenheit value and multiplying the result
by 5/9. Display both values. Save the class as FahrenheitToCelsius.java.
* */

public class FahrenheitToCelsius {
    private Integer Farenheit;

    public FahrenheitToCelsius(Integer Farenheit){
        this.Farenheit = Farenheit;
    }

    public double getCelcius() {
        double celcius;
        celcius = (Farenheit-32)*(0.5556);
        return celcius;
    }

    public String Mostrar(){
        return "en Farenheit: "+Farenheit+" \nen Celcius: "+getCelcius();
    }
}
