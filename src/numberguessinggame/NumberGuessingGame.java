/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessinggame;

import numberguessinggame.util.UtilGame;

/**
 *
 * @author Windows
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        UtilGame ug = new UtilGame(); 
        
        int chocie = ug.menu(); 
        int attempts =ug.diffLevel(chocie); 
        ug.guessing(attempts);
    }
    
}
