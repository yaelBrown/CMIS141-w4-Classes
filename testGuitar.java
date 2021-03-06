/*
 * File: testGuitar.java
 * Author: Yael Brown
 * Date: August 24, 2017 
 * Purpose: To test file, Guitar.java functions
 */

/**
 * Guitar Test Class
 */
public class testGuitar {
	public static void main(String[] args) {

		// Construct new guitar
		Guitar g1 = new Guitar(4, 25.3, "Fender", "Green");

        // Construct default guitar
        Guitar g2 = new Guitar();

		// Print required output
        System.out.println("toString(): (" + g1.toString() + " )");
        System.out.println("getLength(): " + g1.getLength());
        System.out.println("getNumStrings(): " + g1.getStrings());
        System.out.println("getGuitarManufacturer(): " + g1.getManufacturer());
        System.out.println("getGuitarColor(): " + g1.getColor());

        // call playGuitar method
        playGuitar.main(null);
    }
}