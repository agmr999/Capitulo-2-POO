package Capitulo2.Ejercicios;
import javax.swing.JOptionPane;

/*Convert the ProjectedSales class to an interactive application. Instead of
assigning values to the North and South current year sales variables, accept them
from the user as input. Save the revised class as ProjectedSalesInteractive.java.*/

public class ProjectedSalesInteractive {
    private static final double PROJECTED = 0.10;




    public String getprojectedNorth() {

        String numero = JOptionPane.showInputDialog("las ventas de la division norte: ");
        double norte = Double.parseDouble(numero);
        double resultado = (norte*PROJECTED)+norte;
        return"las ventas proyectadas para el norte dentro del proximo mes son: "+resultado;
    }


    public String getprojectedSouth() {
        String respuesta2 = JOptionPane.showInputDialog("las ventas de la division sur: ");
        double sur = Double.parseDouble(respuesta2);
        double resultado = (sur*PROJECTED)+sur;
        return"las ventas proyectadas para el norte dentro del proximo mes son: "+resultado;
    }


}
