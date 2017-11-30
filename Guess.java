// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          
          numToGuess = generator.nextInt(10) + 1;
          
          //print message asking user to enter a guess
          
          System.out.println("Enter your guess between 1 and 10");
            guess = scan.nextInt();
          
          //read in guess
                    
          while ( guess != numToGuess )  //keep going as long as the guess is wrong
            {
                  //print message saying guess is wrong
                  System.out.println("Sorry but that answer is incorrect");
                  //get another guess from the user
                  System.out.println("Enter a different guess between 1 and 10");
                    guess = scan.nextInt();
          }
 
          //print message saying guess is right
          System.out.println("Congratulations! You guessed a number between 1 and 10....");
          System.out.println(" ");
          System.out.println("What, do you want a medal or something, get outta here!");
        }
}