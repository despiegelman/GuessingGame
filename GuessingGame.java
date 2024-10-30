import java.util.*;
public class GuessingGame{
    public static void main (String[]args){
        int num = (int)(Math.random()*101);
        int counter = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a random number between 0 and 100: ");
        int guess = input.nextInt();
        while (num != guess){
            if (guess < num){
                System.out.println("Too low!");
            }
            else{
                System.out.println("Too high!");
            }
            System.out.print("Guess a random number between 0 and 100: ");
            guess = input.nextInt();
            counter++;
        }
        System.out.println("You got it!\n" + counter);
        if (counter < 7){
            System.out.println("You did great! You got it under 7 guesses");
        }else if (counter == 7){
            System.out.println("You did great! You got it in 7 guesses");
        }    
        else{
            System.out.println("You should work on your strategy. You got it in more than 7 guesses");
        }
    }
}