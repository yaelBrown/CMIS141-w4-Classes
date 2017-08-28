import java.util.*;
import java.util.Random;

public class playGuitar
{
    public static void main(String[] args)
    {
        // Declare variables
        int value;
        String letter;
        Random r = new Random();

        // Declare default values
        letter = null;

        // Generate random number
        value = r.nextInt(7 - 1 + 1) + 1;

        // Test the value of 'value'
        System.out.println("Value of value is :" + value);

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
        case 7:      letter = "G";
                    break;
        default:    letter = null;
                    break;
        }

        // Test output
        System.out.println("Value of letter = " + letter);
    }
}