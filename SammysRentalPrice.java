package Capitulo2.CaseProblems;

/*Sammy’s Seashore Supplies rents beach equipment such as kayaks, canoes, beach
chairs, and umbrellas to tourists. Write a program that prompts the user for the
number of minutes he rented a piece of sports equipment. Compute the rental
cost as $40 per hour plus $1 per additional minute. (You might have surmised
already that this rate has a logical flaw, but for now, calculate rates as described
here. You can fix the problem after you read the chapter on decision making.)
Display Sammy’s motto with the border that you created in the SammysMotto2
class in Chapter 1. Then display the hours, minutes, and total price. Save the
file as SammysRentalPrice*/

public class SammysRentalPrice {
private Integer minutes;
private static final Integer PERHOURS = 40;

public SammysRentalPrice(Integer minutes){
    this.minutes = minutes;
}

public Integer getHours(){
    int hours;
    hours = minutes/60;
    return hours;
}

public Integer getMinutes(){
    int gminutes;
    gminutes = minutes%60;
    return gminutes;
}

public Integer Total(){
    int total;
    total = (getHours()*PERHOURS)+getMinutes();
    return total;
}

    public String motto(){
        return  "** ******************************* **\n"+
                "** Sammy’s makes it fun in the sun **\n"+
                "** ******************************* **";
    }

    public String Mostrar(){

        return   motto()+"\n"+
                "numero de horas: "+getHours()+
                " \nnumero de minutos: "+getMinutes()+
                " \nel precio total es: "+Total();
    }

}
