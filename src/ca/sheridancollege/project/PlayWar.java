package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * Play War class has main method which allows User to play War Game
 * @author AhmadBustani
 * @modifier JaykumarChaudhari
 * @modifier ElmerAlmeida
 * @modifier JeremiahTorralba
 */
public class PlayWar {
  //data members
    private static WarGame wargame;
    
    public static void main (String[] args) {   
        //declare variables
        boolean validEntry;
        Scanner scan = new Scanner (System.in);
        String entry;
          
        do {
            System.out.println("Enter 'play' if you would like to play against me!");
            System.out.println("Enter 'q' to exit");
            
            //get user input
            entry = scan.nextLine();
            
            //check if either human, computer, or neither
            if (entry.equalsIgnoreCase("play")) {
                //entry is valid
                validEntry = true;
                
            // if player wants to quit    
            } else if (entry.equalsIgnoreCase("q")) {
                System.exit(0);
                //entry is valid
                validEntry = true;
                
            } else {
                //invalid entry
                validEntry = false;
                
                //re-prompt user
                System.out.println("Invalid entry!");
            }
        } while (!validEntry);
        
        //start setup method in proper game type
        wargame.play();
    }        
}