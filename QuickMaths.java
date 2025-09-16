import java.lang.Math;
import java.util.Scanner;

public class QuickMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.println("Enter a decimal number, any decimal number: ");
        double userNumber = input.nextDouble();
        input.close();

        // Used Math.ceil as it rounds up to the greatest integer to the number
        System.out.println("The smallest integer greater than or equal to " + userNumber + " Is: " + Math.ceil(userNumber));
        // Used Math.floor as it rounds down to the lowest integer to the number
        System.out.println("The smallest integer greater than or equal to " + userNumber + " Is: " + Math.floor(userNumber));
        // Used Math.rint as it rounds to the closest but ties when it is a even double (ex. 11.5)
        System.out.println("The integer that is closest to the number with ties going to even to " + userNumber + " Is: " + Math.rint(userNumber));
        // Used Math.round as it is the standard rounding method
        System.out.println("The integer that is closest to the number to " + userNumber + " Is: " + Math.rint(userNumber));
        // Casts number to int
        int userInt = (int)(userNumber);
        System.out.println("Your number as a character is... " + (char) (userInt)); // Cats the number to a character
        // Add 1 to that number and print the next character
        System.out.println("Your number as a character plus 1 is... " + (char) (userInt + 1));  // Casts the number to a character and adds 1
        System.out.println("Your original decimal number as a integer is..." + userInt);
    }
}
