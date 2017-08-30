/*
 * File: testGuitar.java
 * Author: Yael Brown
 * Date: August 24, 2017 
 * Purpose: To test file, Guitar.java functions
 */

/**
 * Guitar Test
 */
public class testGuitar {
	public static void main(String[] args) {

		// Construct new guitar
		Guitar test = new Guitar(6, 25.3, "Fender", "Green");

        // Construct default guitar
        Guitar test2 = new Guitar();

		// Print required output
        System.out.println("toString(): (" + test.toString() + " )");
        System.out.println("getNumStrings(): ");
        test.getStrings();
        System.out.println("getGuitarManufacturer(): ");
        test.getManufacturer();
        System.out.println("var");
        System.out.println("var");
        System.out.println("var");
    }
}