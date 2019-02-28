package Capitulo2.Ejercicios;

import javax.swing.JOptionPane;
/*Meadowdale Dairy Farm sells organic brown eggs to local customers. They charge
$3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen.
Write a class that prompts a user for the number of eggs in the order and then
display the amount owed with a full explanation. For example, typical output might
be, “You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45.0
cents each for a total of $7.85.” Save the class as Eggs.java.*/

public class Eggs {

    private Integer huevos;
    private static final double CDOCENAS = 3.25;
    private static final double CINDIVIDUALES = 0.45;

    public Eggs(Integer huevos){
        this.huevos = huevos;
    }

    public Integer getDocenas() {
        Integer docenas;
        docenas = huevos/12;
        return docenas;
    }

    public Integer getIndividuales(){
        Integer Individual;
        Individual = huevos%12;
        return  Individual;
    }

    public Double getPrecio(){
        double precio;
        precio = (getDocenas()*CDOCENAS)+(getIndividuales()*CINDIVIDUALES);
        return precio;
    }

    public String Mostrar(){
        return "usted va a pagar: "+getPrecio()+" pesos"+"\n su pedido es de: "+getDocenas()+" docenas y "+getIndividuales()+" huevos individuales";
    }
}
