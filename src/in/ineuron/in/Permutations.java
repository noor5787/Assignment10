package in.ineuron.in;
import java.util.*;
public class Permutations {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	        
	        System.out.println("Permutations:");
	        permute(str.toCharArray(), 0);
	    }
	    
	    private static void permute(char[] str, int index) {
	        if (index == str.length - 1) {
	            System.out.println(new String(str));
	            return;
	        }
	        
	        for (int i = index; i < str.length; i++) {
	            swap(str, index, i);
	            permute(str, index + 1);
	            swap(str, index, i);
	        }
	    }
	    
	    private static void swap(char[] str, int i, int j) {
	        char temp = str[i];
	        str[i] = str[j];
	        str[j] = temp;
	    }
	}


