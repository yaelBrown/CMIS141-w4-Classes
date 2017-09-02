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
public class Guitar {
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
        
        // toString method
        public String toString() {
            String str = "Number of Strings: " + numStrings + 
                        ". Length of guitar: " + guitarLength +
                        ". Manufacturer of guitar: " + guitarManufacturer +
                        ". Color of guitar: " + guitarColor;
            return str;
        }

        public String pGuitar() {
            playGuitar.main(null);
            return "1";
        }
}