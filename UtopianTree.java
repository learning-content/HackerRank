import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int height = 1;
			int cycle = sc.nextInt();
			for(int j=1; j<=cycle; j++) {
				if(j%2==1) {
					height *= 2;
				}
				else if(j%2==0) {
					height += 1;
				}
			}
			System.out.println(height);						
		}
	}

}
