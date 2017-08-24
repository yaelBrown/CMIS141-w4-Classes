/*
 * File: Guitar.java
 * Author: Yael Brown
 * Date: August 24, 2017
 * Purpose: Create a Java program that creates a class and tests
 * getters and setters for that constructed class.
 */

/**
 * Guitar Class
 */
public class Guitar {
	// Declare variables to hold values.
	private int numStrings; // Defines number of strings
	private double guitarLength; // Defines length of Guitar
	private String guitarManufacturer; // Defines manufacturer of Guitar
	private String guitarColor; // Defines color of guitar
	
	// Default constructor with default values
	public Guitar () 
	{
		numStrings = 6;
		guitarLength = 28.2;
		guitarManufacturer = "Gibson";
		guitarColor = "Red";
	}
	
	// Constructor for Guitar (look up how to make constructors)
	public void newGuitar(
			int numStrings, 
			double guitarLength,
			String guitarManufacturer,
			String guitarColor)
	{
		int strings = numStrings;
		double length = guitarLength;
		String manufacturer = guitarManufacturer;
		String color = guitarColor;
	}
	
	
	
	// Setter methods for all data fields
	public void setStrings(int strings){
		numStrings = strings;
	}
	
	public void setLength(double length){
		guitarLength = length;
	}
	
	public void setManufacturer(String manufacturer){
		guitarManufacturer = manufacturer;
	}
	public void setColor(String color){
		guitarColor = color;
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
	
	// Displays info
	public void toString() {
		System.out.println("Number of Strings: " + numStrings);
		System.out.println("Length of Guitar: " + guitarLength);
		System.out.println("Name of Manufacturer: " + guitarManufacturer);
		System.out.println("Color of Guitar: " + guitarColor);
	}
}
