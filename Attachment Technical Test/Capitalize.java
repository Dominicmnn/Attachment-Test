
    // Write a program that accepts a string as input, capitalizes the first letter of each word in the 
    // string, and then returns the result string.

    // Examples: 
// "hi"=> returns "Hi"
// "i love programming"=> returns "I Love Programming"

import java.util.Scanner;

class CapitalizeFirstLetter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String capitalizedString = capitalizeFirstLetter(input);
        System.out.println("Capitalized string: " + capitalizedString);
    }

    public static String capitalizeFirstLetter(String str) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        
        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                ch = Character.toUpperCase(ch);
                capitalizeNext = false;
            }
            result.append(ch);
        }
        
        return result.toString();
    }
}