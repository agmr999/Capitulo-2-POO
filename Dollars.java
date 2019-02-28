package Capitulo2.Ejercicios;

/*
Write a class that calculates and displays the conversion of an entered number of dollars
into currency denominations—20s, 10s, 5s, and 1s. Save the class as Dollars.java.
*/

public class Dollars {
 Integer TDollars;

 public Dollars(Integer TDollars){
     this.TDollars = TDollars;
 }

 public Integer get20ś(){
     Integer _20ś;

     _20ś = TDollars/20;

     return _20ś;
 }

 public Integer get10ś(){
     Integer _10ś;
     Integer resto;

      resto = TDollars-get20ś()*20;
     _10ś = resto/10;

     return _10ś;
 }

 public Integer get5ś(){
     Integer _5ś;
     Integer resto;

     resto = TDollars-(get10ś()*10+get20ś()*20);
     _5ś = resto/5;
     return _5ś;
 }

 public Integer get1ś(){
     Integer _1ś;
     Integer resto;

     resto = TDollars-(get10ś()*10+get20ś()*20+get5ś()*5);
     _1ś = resto;
     return _1ś;
 }

 public String Mostrar(){
     return "usted ingreso: "+TDollars+" unidades\n"+
             "tiene "+get20ś()+" billete(s) de 20\n"+
             get10ś()+" billete(s) de 10\n"+
             get5ś()+" billete(s) de 5\n"+
             get1ś()+" billete(s) de 1";
 }
}
