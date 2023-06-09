package in.ineuron.in;

public class ContiguousSubstringsCount {

	    public static void main(String[] args) {
	        String s = "abcab";
	        int count = countContiguousSubstrings(s);
	        System.out.println("Count of contiguous substrings: " + count);
	    }
	    
	    public static int countContiguousSubstrings(String s) {
	        int count = 0;
	        int n = s.length();
	        
	        // Iterate through each character
	        for (int i = 0; i < n; i++) {
	            char c = s.charAt(i);
	            
	            // Count the substring itself
	            count++;
	            
	            // Expand on both sides to find contiguous substrings
	            int left = i - 1;
	            int right = i + 1;
	            
	            while (left >= 0 && right < n && s.charAt(left) == c && s.charAt(right) == c) {
	                // Count the contiguous substring
	                count++;
	                
	                // Expand further
	                left--;
	                right++;
	            }
	        }
	        
	        return count;
	    }
	}


