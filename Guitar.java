/*
 * File: Guitar.java
 * Author: Yael Brown
 * Date: August 24, 2017
 * Purpose: Create a Java program that creates a class and tests
 * getters and setters for that constructed class.
 */
// Import required java libraries
import java.util.*;
import java.util.Random;

/**
 * Guitar Class
 */
public class Guitar 
{
        // Declare variables to hold values.
        private int numStrings; // Defines number of strings
        private double guitarLength; // Defines length of Guitar
        private String guitarManufacturer; // Defines manufacturer of Guitar
        private String guitarColor; // Defines color of guitar
        
        // Constructor for Guitar
        public Guitar(
                int strings, 
                double length,
                String manufacturer,
                String color) {
            numStrings = strings;
            guitarLength = length;
            guitarManufacturer = manufacturer;
            guitarColor = color;
        }

        // Default constructor with default values
        public Guitar() {
            int numStrings = 6;
            double guitarLength = 28.2;
            String guitarManufacturer = "Gibson";
            String guitarColor = "Red";
        }

        // Setter methods for all data fields
        public void setStrings(int strings) {
            strings = numStrings;
        }
        
        public void setLength(double length) {
            length = guitarLength;
        }
        
        public void setManufacturer(String manufacturer) {
            manufacturer = guitarManufacturer;
        }

        public void setColor(String color) {
            color = guitarColor;
        }
        

        // Getter methods for all data fields
        public int getStrings() {
            return numStrings;
        }
        
        public double getLength() {
            return guitarLength;
        }
        
        public String getManufacturer() {
            return guitarManufacturer;
        }
        
        public String getColor() {
            return guitarColor;
        }
        
        // playGuitar method 
        /*
        public String playGuitar() 
        {
            // Declare variables
            int value;
            int value2;
            String letter;
            String noteLength;
            Random r = new Random();
            Random ra = new Random();

            // Declare default values
            letter = null;
            noteLength = null;

            // Generate random number
            value = r.nextInt(7 - 1 + 1) + 1;
            value2 = r.nextInt(5 - 1 + 1) + 1;

            // Test the value of 'value'
            System.out.println("Value of value is = " + value);

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

            // Test output
            System.out.println("Value of letter = " + letter);
            System.out.println("Value of noteLength = " + noteLength);

            // Beginning output playGuitar into array
            System.out.print("playGuitar(): { ");

            // Generate
            for (int i = 0; i < 16; i++) {
                System.out.print(letter + "(" + noteLength +") ");
                value = new Random(16).nextInt(7 - 1 + 1) + 1;
                value2 = new Random(16).nextInt(5 - 1 + 1) + 1;
            }
            // Ending output playGuitar into array
            System.out.print("}");

            return playGuitar();
        }
        */

        // toString method
        public String toString() {
            String str = "Number of Strings: " + numStrings + 
                        ". Length of guitar: " + guitarLength +
                        ". Manufacturer of guitar: " + guitarManufacturer +
                        ". Color of guitar: " + guitarColor;
            return str;
        }
}
