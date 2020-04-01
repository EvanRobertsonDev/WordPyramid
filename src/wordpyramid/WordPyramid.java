/*
 * Evan Robertson
 * WordPyramid.java
 * April 1st 2020
 * This program creates a pyarmid of letters based off of the origianlly inputted word
 * using recursive algorithms
 */

package wordpyramid;
import javax.swing.*;
/**
 *
 * @author Evan
 */
public class WordPyramid {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get input
        String pyramidWord = JOptionPane.showInputDialog("Enter a word");
        //Print original
        System.out.println(pyramidWord);
        //Start recursion
        pyramid(pyramidWord);
    }
    
    //This method uses recursion to continously trim off the neds of the word until
    //1 or 2 letters remain
    public static String pyramid(String str) {
        //Base case
        if (str.length() == 1 || str.length() == 2) {
            return str;
        }
        //Trims off each letter and prints to screen
        else {
            String newStr = str.substring(1, str.length()-1);
            System.out.println(newStr);
            //Continue rescursive algorithm
            pyramid(newStr);
            return str;
        }
    }
    
}
