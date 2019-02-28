package Capitulo2.Ejercicios;

/*The Happy Yappy Kennel boards dogs at a cost of 50 cents per pound per day. Write
a class that accepts a dog’s weight and number of days to be boarded and displays the
total price for boarding. Save the class as DogBoarding*/

public class DogBoarding {

    private Double DogsWeight;
    private Integer days;

public DogBoarding(Integer days){
    this.DogsWeight = 0.50;
    this.days = days;
}

public double TotalPrice(){
    double TotalPrice;
    TotalPrice = DogsWeight*days;
    return TotalPrice;
}


}
