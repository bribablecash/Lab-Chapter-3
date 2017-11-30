// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        
        
        
        //Get player's play -- note that this is stored as a string
        Scanner scan = new Scanner(System.in);
   
        System.out.println("Enter your play with a capital letter: R, P, or S");
           personPlay = scan.next();
                
        //Make player's play uppercase for ease of comparison
       
        //Generate computer's play (0,1,2)
        Random generator = new Random();
        computerInt = generator.nextInt(3);
        
        //Translate computer's randomly generated play to string
        if(computerInt == 0){
            computerPlay = "R";
        }
        else if(computerInt == 1){
            computerPlay = "P";
        }
        else{
            computerPlay = "S";
        }
        
        //Print computer's play
        
        System.out.println("The computer picks " + computerPlay);
         
        
        
        //See who won.
        
        // Rock
        if(personPlay == "R"){
           if(computerPlay == "R"){
               System.out.print("You both picked Rock. It's a tie!");
           }
           else if(computerPlay == "P"){
               System.out.print("Paper suffocates rock, you lose!");
           }
           else{
               System.out.print("Rock crushes scissors, you win!");
           }
        }
        
        //Paper
        else if(personPlay == "P"){
           if(computerPlay == "R"){
               System.out.print("Paper suffocates rock, you win!");
           }
           else if(computerPlay == "P"){
               System.out.print("You both picked Paper. It's a tie!");
           }
           else{
               System.out.print("Scissors cut paper, you lose!");
           }
        }
        
        //Scissors
        else { 
           if(computerPlay == "R"){
               System.out.print("Rock crushes scissors, you lose!");
           }
           else if(computerPlay == "P"){
               System.out.print("Scissors cut paper, you win!");
           }
           else{
               System.out.print("You both picked Scissors. It's a tie!");
           }
        }
    }
}
