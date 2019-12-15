package _07_fortune_teller;
import javax.swing.SwingUtilities;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
      	 SwingUtilities.invokeLater(new FortuneTeller());
      	 begin();
       }
    
    static void begin() {
      	 // Welcome the user. Give them a hint for the secret location.
    	System.out.println("Welcome to the fortune telling game.");
    	System.out.println("This will tell you your fortune.");
    	System.out.println("One could think this is similar to a magic eight ball.");
    }
}
