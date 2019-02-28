package Capitulo2.Ejercicios;

public class Initials {
    private Character inicial1;
    private Character inicial2;
    private Character inicial3;

    public Initials(char inicial1, char inicial2, char inicial3){
        this.inicial1 = inicial1;
        this.inicial2 = inicial2;
        this.inicial3 = inicial3;
    }

    public String getInicials(){
        return ""+inicial1+"."+inicial2+"."+inicial3;

    }

}
