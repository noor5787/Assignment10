package in.ineuron.in;
import java.util.Scanner;
public class TowerOfHanoi {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of discs: ");
	        int N = scanner.nextInt();
	        scanner.close();

	        int moves = solveTowerOfHanoi(N, "1", "2", "3");
	        System.out.println("Total moves: " + moves);
	    }

	    public static int solveTowerOfHanoi(int N, String source, String auxiliary, String destination) {
	        if (N == 1) {
	            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
	            return 1;
	        }

	        int moves = 0;
	        moves += solveTowerOfHanoi(N - 1, source, destination, auxiliary);
	        System.out.println("Move disk " + N + " from rod " + source + " to rod " + destination);
	        moves++;
	        moves += solveTowerOfHanoi(N - 1, auxiliary, source, destination);

	        return moves;
	    }
	}


