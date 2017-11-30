// ***************************************************************
//   Charge.java
//
//   
//   
//   
//   
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class Charge
{
   public static void main (String[] args)
   {
       //Variables
       double initialBalance;       //Original balance for customer.
       double additionalCharges;    //Charges aquired throughout the month.
       double newBalance;           //New balance for customer.
       double minimumPayment;       //How much the customer needs to pay.
       double interest;
       //Input for values
       Scanner scan = new Scanner(System.in);
   
       System.out.print ("Enter the current balance: ");
           initialBalance = scan.nextDouble();
       System.out.print ("Enter the amout of charges aquired throughout the month: ");
           additionalCharges = scan.nextDouble();
       
          
       //Determine Interest    
       interest = ((initialBalance + additionalCharges) * 0.02);
       newBalance = initialBalance + interest;
       
       
       //Determine Minimum Payment
       if(newBalance < 50.00){
           minimumPayment = newBalance;
       }
       else if(newBalance > 50.00 && newBalance < 300.00 ){
           minimumPayment = 50.00;
       }
       else{
           minimumPayment = (newBalance * .20);
       }
       
       
       //Print the statement
       System.out.println("   ");
       System.out.println("CS CARD International Statement");
       System.out.println("===============================");
       System.out.println("   ");
       System.out.println("Previous Balance:\t\t$" + initialBalance);
       System.out.println("Additional Charges:\t\t$" + additionalCharges);
       System.out.println("Interest:\t\t\t$" + interest);
       System.out.println("   ");
       System.out.println("New Balance\t\t\t$" + newBalance);
       System.out.println("   ");
       System.out.println("Minimum Payment\t\t\t$" + minimumPayment);
    }
}
