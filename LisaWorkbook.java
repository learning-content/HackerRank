import java.util.HashMap;
import java.util.Scanner;

public class LisaWorkbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int page = 1;
		int ans = 0;
		for(int i=0; i<n; i++) {	// each chapter
			int t = scan.nextInt();
			for(int j=1; j<=t; j++) {	// each problem
				if(page == j)
					ans++;
				if(j%k == 0)
					page++;
			}
			if(t%k!=0)	// last problem of chapter
				page++;
		}
		System.out.println(ans);
	}
}
