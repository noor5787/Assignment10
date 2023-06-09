package in.ineuron.in;

public class PowerOfThree {

	    public static boolean isPowerOfThree(int n) {
	        if (n <= 0) {
	            return false;
	        }
	        
	        while (n % 3 == 0) {
	            n /= 3;
	        }
	        
	        return n == 1;
	    }

	    public static void main(String[] args) {
	        int n = 27;
	        boolean result = isPowerOfThree(n);
	        System.out.println(result);  // Output: true

	        n = 0;
	        result = isPowerOfThree(n);
	        System.out.println(result);  // Output: false
	    }
	}


