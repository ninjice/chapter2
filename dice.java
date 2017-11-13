// **************************************************
//   dice.java
//
//   To roll dice
// **************************************************
 
import java.util.Random;
import java.util.Scanner;

public class dice

{
   public static void main (String[] args)
   {
       
       
        }
   public void roll(int numberOfDice){
       Random generator = new Random();
       int total = 0;
       for(int i = 0; i < numberOfDice; i++){
           int result = (int) (generator.nextInt(7));
           System.out.println("Roll " + (1 + i) + " is " + result + "!");
           total += result;
           System.out.println("Your total is " + total + "!");
       }
   }
   public void getInput(){
       Scanner keyboard = new Scanner(System.in);
       System.out.print("How many dice would you like to roll?");
       int input = keyboard.nextInt();
   }
}