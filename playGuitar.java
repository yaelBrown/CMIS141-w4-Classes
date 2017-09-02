/*
 * File: Guitar.java
 * Author: Yael Brown
 * Date: August 24, 2017
 * Purpose: Create a Java program that creates a class and tests
 * getters and setters for that constructed class.
 */

// Import required java classes
import java.util.*;
import java.util.Random;

/**
 * playGuitar Class
 */
public class playGuitar {
    public static void main( String[] args ) {
        // Declare variables
        int value = 1;
        int value2 = 1;
        String letter = null;
        String noteLength = null;
        Random r = new Random();

        // Beginning output playGuitar into array
        System.out.print("playGuitar: { ");

        // Generate
        for (int i = 0; i < 15; i++) {
            // Generate random notes
            value = r.nextInt(7 - 1 + 1) + 1;
            // Switch statement to convert to letter
            switch (value) {
            case 1:     letter = "A";
                        break;
            case 2:     letter = "B";
                        break;
            case 3:     letter = "C";
                        break;
            case 4:     letter = "D";
                        break;
            case 5:     letter = "E";
                        break;
            case 6:     letter = "F";
                        break;
            case 7:     letter = "G";
                        break;
            default:    letter = null;
                        break;
            }
            // Generate random lengths
            value2 = r.nextInt(5 - 1 + 1) + 1;
            // Switch statement to convert random to noteLength
            switch (value2) {
            case 1:     noteLength = ".25";
                        break;
            case 2:     noteLength = ".5";
                        break;
            case 3:     noteLength = "1";
                        break;
            case 4:     noteLength = "2";
                        break;
            case 5:     noteLength = "4";
                        break;
            default:    noteLength = null;
                        break;
            }
            System.out.print(letter + "(" + noteLength +") ");
        }
        // Ending output playGuitar into array
        System.out.println("}");
    }
}