import java.util.*;
import java.util.Random;

public class playGuitar
{
    public static void main(String[] args)
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
    }
}