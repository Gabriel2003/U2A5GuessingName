/*
 * Gabriel Hurtado
 * Guessing Game
 * March 24th,2018
 * this program is used to play a little game of a gessing game, the user 
is suposed to guess a random number between 1 and 100. 
 */
package guessinggame;

/**
 *
 * @author gabriel
 */

import javax.swing.JOptionPane; 
import java.util.Random; 

public class Guessinggame {
    public static void main(String[] args) {
        // This is the algorythm I will use for this program.
        
        Random random = new Random();
        int randNum = (int)Math.ceil(Math.random()*100); 
        //Generates a random number between 1 and 100 
        boolean userCorrect = false; 
        String userInputString; 
        int userGuessedNumber; 
        
        while( !userCorrect ) {
           userInputString = JOptionPane.showInputDialog (" Guess the Number: " ); 
           userGuessedNumber = Integer.parseInt( userInputString ); 
           
           if (userGuessedNumber > randNum) {
              
               JOptionPane.showMessageDialog(null, " Too High " +  + randNum );
               
           } 
           
           else if ( userGuessedNumber < randNum){
               
               JOptionPane.showMessageDialog(null, " Too Low " +  + randNum );
           
               }
           
           else {
               JOptionPane.showMessageDialog(null, " Congratulations You Guessed The number " );
               userCorrect = true; 
           }
    }
        System.exit( 0 ); 
    }
}
