import java.util.Scanner;

public class SquareRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        	int n1 = in.nextInt();
        	int n2 = in.nextInt();
        	int count = 0;
        	if(n2 >= n1) {
        	
        		int numOfSqrt = (int) (Math.floor(Math.sqrt(n2)) - Math.ceil(Math.sqrt(n1)) + 1);
        		System.out.println(numOfSqrt);
        		
        	}
        	
        }

	}

}
