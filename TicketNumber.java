package Capitulo2.Ejercicios;

/*Travel Tickets Company sells tickets for airlines, tours, and other travel-related
services. Because ticket agents frequently mistype long ticket numbers, Travel
Tickets has asked you to write an application that indicates invalid ticket number
entries. The class prompts a ticket agent to enter a six-digit ticket number. Ticket
numbers are designed so that if you drop the last digit of the number, then divide the
number by 7, the remainder of the division will be identical to the last dropped digit.

Step 1 Enter the ticket number; for example, 123454.
Step 2 Remove the last digit, leaving 12345.
Step 3 Determine the remainder when the ticket number is divided by 7. In this
case, 12345 divided by 7 leaves a remainder of 4.
Step 4 Assign the Boolean value of the comparison between the remainder and
the digit dropped from the ticket number.
Step 5 Display the result— true or false —in a message box.
*/

public class TicketNumber {

    private Integer Ticket;

    public TicketNumber(Integer Ticket){
        this.Ticket = Ticket;
    }

    public boolean isGood(){
        boolean logic = false;
        Integer TestResult = Ticket%10;
        Integer divide = (Ticket/10)%7;

        logic = (TestResult == divide)? true:false;

        return logic;
    }

    public String Mostrar(){
       String s;

       s = isGood()? s = "boleto valido" : "boleto invalido";
        return s;
    }

}
