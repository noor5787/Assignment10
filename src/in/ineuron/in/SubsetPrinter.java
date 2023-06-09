package in.ineuron.in;

public class SubsetPrinter {

	    public static void printSubsets(String set) {
	        printSubsetsHelper(set, "", 0);
	    }

	    private static void printSubsetsHelper(String set, String currentSubset, int index) {
	        if (index == set.length()) {
	            System.out.print("\"" + currentSubset + "\" ");
	            return;
	        }

	        // Include the current character
	        printSubsetsHelper(set, currentSubset + set.charAt(index), index + 1);

	        // Exclude the current character
	        printSubsetsHelper(set, currentSubset, index + 1);
	    }

	    public static void main(String[] args) {
	        String set = "abc";
	        System.out.println("Input: " + set);
	        System.out.print("Output: { ");
	        printSubsets(set);
	        System.out.println("}");
	    }
	}


