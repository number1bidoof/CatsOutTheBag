import java.util.Scanner;

public class CatsCradle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String, Any String!: ");
        String usersCat = scanner.nextLine();

        // prints out the length of the users string
        System.out.println("The length of your string is... " + usersCat.length());
        // prints out the first letter in the string
        System.out.println("The first character in your string is... " + usersCat.charAt(0));
        // prints out the last letter in the string
        System.out.println("The last character in your string is... " + usersCat.charAt(usersCat.length()-1));
        // prints out the string without any whitespace
        System.out.println("Your string without any spaces is... " + usersCat.trim());
        // prints out the string in all uppercase
        System.out.println("Your string in all uppercase is... " + usersCat.toUpperCase());
        // prints out the string in all lowercase
        System.out.println("Your string to all lowercase is... " + usersCat.toLowerCase());

        System.out.println("Enter a character, any character");
        // takes the first character (if the user inputs a string)
        char usersDog = scanner.next().charAt(0);
        if (Character.isDigit(usersDog)) { // if the number is a digit
            System.out.println("Your character is a digit!");
        } else if (Character.isLetter(usersDog)) {
            System.out.println("Your character is a letter!"); // if it is a letter
            if (Character.isLowerCase(usersDog)){ // if the letter is lowercase
                System.out.println("Your character is lowercase!");
            } else if (Character.isUpperCase(usersDog)) { // if the letter is uppercase
                System.out.println("Your character is uppercase!");
            }
        } else { // if it's neither :)
            System.out.println("Your character is neither a Letter or a Digit!!!!");
        }
        System.out.println("The numeric value of your character is... " + (int)(usersDog));
		// Bonus question time :)
		System.out.println("Enter a substring to search in" + usersCat)
		int usersLizard = scanner.nextInt();
		String usersSnake = usersCat.substring(usersLizard);
		if (usersSnake == -1){
			System.out.println("Sorry gang its not here, try later twin")
		} else {
			System.out.println(usersSnake)
		}
    }
}
