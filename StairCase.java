
public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=0; i<n; i++) {
				for(int k=n-i-1; k>0; k--) {
					System.out.print(" ");
				}
				for(int j=0; j<=i; j++) {
					System.out.print("#");
				}
			System.out.print("\n");
		}

	}

}
