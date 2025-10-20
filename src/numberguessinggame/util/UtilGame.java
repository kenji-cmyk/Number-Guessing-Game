/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numberguessinggame.util;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class UtilGame {
      
    private final  Scanner sc = new Scanner (System.in);
    
    public void guessing(int attempt){
        
        Random rand = new Random(); 
        int randomNumber = rand.nextInt(100) + 1; 
        boolean flagSuccess = false; 
        while(attempt > 0 && !flagSuccess){
            
            System.out.print("Enter your guess : "); 
            int guessingNumber = sc.nextInt(); 
            
            attempt--; 
            
            if(randomNumber == guessingNumber){
                flagSuccess = true; 
            } else if (randomNumber > guessingNumber){
                System.out.println("The number greater than " + guessingNumber);
            } else{
                System.out.println("The number smaller than " + guessingNumber);
            }
        }
       
        if(flagSuccess){
            System.out.println("Congratulations! You guessed the correct number in " + attempt + " attempts");
        } else {
            System.out.println("You are out of attempts");
        }
    }
    
    public int diffLevel (int level){
    
        int attempts = 0; 
        
        if (level == 3) attempts = 3; 
        else if (level == 2) attempts = 5; 
        else if (level == 3) attempts = 10; 
        
        return attempts; 
    }
    
    public int menu(){
        
        int choice = 100; 
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        while(choice > 3 || choice < 1){
            System.out.print("Enter your choice : ");
            choice = sc.nextInt(); 
        }
        
        return choice; 
    
    }
    
}
