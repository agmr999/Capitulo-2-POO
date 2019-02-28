package Capitulo2.CaseProblems;

/*
* Carly’s Catering provides meals for parties and special events. Write a program that
prompts the user for the number of guests attending an event and then computes the
total price, which is $35 per person. Display the company motto with the border that
you created in the CarlysMotto2 class in Chapter 1, and then display the number of
guests, price per guest, and total price. Also display a message that indicates true
or false depending on whether the job is classified as a large event—an event with
50 or more guests. Save the file as CarlysEventPrice
* */

public class CarlysEventPrice {
    private Integer guests;
    private static final Integer PRECIO = 35;

    public CarlysEventPrice(Integer guests){
        this.guests = guests;
    }

    public Integer Price(){
        int price;
        price = PRECIO*guests;
        return price;
    }

    public String isLarge(){
        boolean large;
        String mensaje;
        large = (guests>=50)? true:false;
        mensaje =  (large==true)? "si, es un gran evento":"no, es un evento regular";
        return mensaje;
    }
        /*“Carly’s makes the food that makes it a
        party.”*/
    public String motto(){
        return "** ******************************************** **\n"+
               "** Carly’s makes the food that makes it a party **\n"+
               "** ******************************************** **";
    }

    public String Mostrar(){

        return   motto()+"\n"+
                "numero de personas: "+guests+
                " \nprecio por persona: "+PRECIO+
                " \nel precio total es: "+Price()+
                " \n¿es un evento mayor? "+isLarge();
    }

}
