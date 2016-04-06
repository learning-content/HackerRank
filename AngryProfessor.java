import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int onTime = 0;
			int late = 0;
			int n = in.nextInt();
			int k = in.nextInt();
			int a[] = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}

			for (int i = 0; i < n; i++) {
				if (a[i] <= 0) {
					onTime++;
				} else if (a[i] > 0) {
					late++;
				}
			}

			if (onTime >= k)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

	}

}
