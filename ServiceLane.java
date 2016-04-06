import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            int min = width[i];
            
            for(int width_i=i; width_i<=j; width_i++) {
            	if(width[width_i] < min) {
            		min = width[width_i];
            	}
            }
            System.out.println(min);
        }

	}

}
