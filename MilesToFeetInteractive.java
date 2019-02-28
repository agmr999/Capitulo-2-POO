package Capitulo2.Ejercicios;
import javax.swing.JOptionPane;

/*Convert the MilesToFeet class to an interactive application. Instead of assigning
a value to the distance, accept the value from the user as input. Save the revised
class as MilesToFeetInteractive.java.*/

public class MilesToFeetInteractive {
    public static final double FEET = 5280;



    public String MilesToFeetInteractive(){
        String respuesta = JOptionPane.showInputDialog("proporcione el numero de  millas: ");
        double miles = Double.parseDouble(respuesta);

        return "la distancia en milllas de mi casa a la casa de mi tio es " + miles + " millas " +
        "y en pies son " + miles*FEET + " pies";
    }
}
