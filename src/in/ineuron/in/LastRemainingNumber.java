package in.ineuron.in;

public class LastRemainingNumber {

	    public static int lastRemaining(int n) {
	        boolean leftToRight = true;
	        int remaining = n;
	        int step = 1;
	        int head = 1;
	        
	        while (remaining > 1) {
	            if (leftToRight || remaining % 2 == 1) {
	                head += step;
	            }
	            
	            step *= 2;
	            remaining /= 2;
	            leftToRight = !leftToRight;
	        }
	        
	        return head;
	    }
	    
	    public static void main(String[] args) {
	        int n = 9;
	        int lastNumber = lastRemaining(n);
	        System.out.println("The last number that remains in arr is: " + lastNumber);
	    }
	}


