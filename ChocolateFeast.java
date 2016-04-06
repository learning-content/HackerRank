import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		for(int i=0; i<tests; i++) {
			int n = scan.nextInt();
			int c = scan.nextInt();
			int m = scan.nextInt();
			int pureChoco = n/c;
			int wrap = pureChoco;
			while(wrap >= m) {
				int modulo = wrap % m;
				wrap = wrap / m;
				pureChoco += wrap;
				wrap += modulo;
			}
			System.out.println(pureChoco);
		}
	}

}
