package Capitulo2.Ejercicios;

/*Write a Java class that declares a named constant that represents next year’s
anticipated 10 percent increase in ProjectedSales for each division of a company. (You can
represent 10 percent as 0.10.) Also declare variables to represent this year’s ProjectedSales
total in dollars for the North and South divisions. Assign appropriate values to
the variables—for example, 4000 and 5500. Compute and display, with
explanatory text, next year’s projected ProjectedSales for each division. Save the class as
ProjectedSales.java*/

public class ProjectedSales {
    private static final double PROJECTED = 0.10;

    private Integer NorthDivision;
    private Integer SouthDivision;

    public Integer getSouthDivision() {
        return SouthDivision;
    }

    public void setSouthDivision(Integer southDivision) {
        SouthDivision = southDivision;
    }

    public Integer getNorthDivision() {
        return NorthDivision;
    }

    public void setNorthDivision(Integer northDivision) {
        NorthDivision = northDivision;
    }

    public String getProjectedSales(){
        double Sventas = (getSouthDivision()*PROJECTED)+getSouthDivision();
        double Nventas = (getNorthDivision()*PROJECTED)+getNorthDivision();

        return "las ventas proyectadas para la division sur son: "+ Sventas +
                " las ventas proyectadas para la division norte son: "+Nventas;
    }
}
