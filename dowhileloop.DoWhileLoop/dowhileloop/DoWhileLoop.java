/*
 * Program: DoWhileLoop.java
 * Student: Lydia Frame 
 * Purpose: Try and guess my lucky number.
 * ask user to inpute a number until they correctly guess the lucky number 7.
 * Then output how many guesses it took them. 
*/
package dowhileloop; 

import java.util.Scanner; 

public class DoWhileLoop{
    public static void main(String[] args){
        //variables 
        Scanner input = new Scanner(System.in);
        int guess;
        int count = 0;

        //Do while loop Keep going till the input = 7
        do{

            System.out.print("Guess a number between 1 - 10: ");
            guess = input.nextInt(); 

            //count the number of guesses 
            count++;

        } while(guess != 7); 

        //print out message after completing the loop
        System.out.println("Lucky number = 7: it took you " + count + " tries.");

    }
}