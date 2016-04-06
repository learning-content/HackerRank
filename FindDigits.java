import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int count = 0;
            int num = n;
            try {
	            while(num>0) {
	            	int rem = num % 10;
	            	if(rem == 0){
	            		num = num / 10;
	            		continue;
	            	}
	            	if((n%rem)==0)
	            		count++;
	            	num = num / 10;
	            }
	            System.out.println(count);
            } catch (ArithmeticException e) {
            	e.printStackTrace();
            }
        }

	}

}
