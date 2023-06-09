package in.ineuron.in;
import java.util.Scanner;
public class CountConsonants {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        int consonantCount = countConsonants(input);
	        System.out.println("Total number of consonants: " + consonantCount);
	    }

	    public static int countConsonants(String str) {
	        int count = 0;
	        str = str.toLowerCase(); // Convert the string to lowercase for easy comparison

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'a' && ch <= 'z') { // Check if the character is an English alphabet
	                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
	                    count++; // Increment the count if the character is a consonant
	                }
	            }
	        }

	        return count;
	    }
	}


