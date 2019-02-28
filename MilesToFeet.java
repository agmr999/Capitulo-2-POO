package Capitulo2.Ejercicios;

public class MilesToFeet {


    public static final double FEET = 5280;
    private double miles;


    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public String IntoMiles() {
        return "la distancia en milllas de mi casa a la casa de mi tio es " + getMiles() + " millas " +
                "y en pies son " + getMiles()*FEET + " pies";
    }
}
