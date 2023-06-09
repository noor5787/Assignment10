package in.ineuron.in;

public class StringLengthRecursive {

	    public static int calculateLength(String str) {
	        // Base case: if the string is empty, its length is 0
	        if (str.isEmpty()) {
	            return 0;
	        }
	        
	        // Recursive case: remove the first character of the string and recursively calculate the length of the remaining substring
	        return 1 + calculateLength(str.substring(1));
	    }
	    
	    public static void main(String[] args) {
	        String str1 = "abcd";
	        System.out.println("Length of '" + str1 + "' is: " + calculateLength(str1));
	        
	        String str2 = "GEEKSFORGEEKS";
	        System.out.println("Length of '" + str2 + "' is: " + calculateLength(str2));
	    }
	}


