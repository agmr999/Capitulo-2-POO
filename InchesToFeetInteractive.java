package Capitulo2.Ejercicios;

import java.util.Scanner;

/*Write a class that declares a variable named inches that holds a length in inches,
and assign a value. Display the value in feet and inches; for example, 86 inches
becomes 7 feet and 2 inches. Be sure to use a named constant where appropriate.
Save the class as InchesToFeet.java.*/

public class InchesToFeetInteractive {

    Scanner rc = new Scanner(System.in);
    private static final Integer FEET = 12;
    private Integer inches;



    public String getInchesintofeet(){

        Integer feet;

        System.out.println("dame el numero de pulgadas: ");
        inches = rc.nextInt();
        feet = inches/FEET;

        return "el numero de pulgadas son: "+inches+" que transformado a pies son: "+feet;
    }

}
