import java.util.Scanner;

public class Sherlock {
	public static int finalFirst;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            if( (n%5)==0 && (n%3)==0 ){
            	int rep5 = 0;
            	rep5 = n / 3;
            	for(int i=0; i<rep5; i++) {
            		System.out.print("555");
            	}
            	System.out.print("\n");
            }
            
            else if( (n%3)==0 ) {
            	int rep5 = 0;
            	rep5 = n / 3;
            	for(int i=0; i<rep5; i++) {
            		System.out.print("555");
            	}
            	System.out.print("\n");
            }
            
//            else if( (n%5)==0 ) {
//            	int rep3 = 0;
//            	rep3 = n / 5;
//            	for(int i=0; i<rep3; i++) {
//            		System.out.print("33333");
//            	}
//            	System.out.print("\n");
//            }
            
            else if (n>0) {
            	//n is even 14 = 9 + 5
            	if(n%2 == 0) {
            		int n1 = n;
            		int n2 = n - n1;
            		int first = splitNumber(n1,n2);
            		int second = n - first;
            		if( (first%3) == 0 && (second%5) == 0 && first>0) {
            			int rep5 = first / 3;
            			int rep3 = second / 5;
            			for(int i=0; i<rep5; i++) {
            				System.out.print("555");
            			}
            			for(int i=0; i<rep3; i++) {
            				System.out.print("33333");
            			}
            			System.out.print("\n");
            		}
            		// if first is divided by 5 ex 26 = 20 + 6
            		else if( (first%5) == 0 && (second%3) == 0 && first>0) {
            			int rep3 = first / 5;
            			int rep5 = second / 3;
            			for(int i=0; i<rep5; i++) {
            				System.out.print("555");
            			}
            			for(int i=0; i<rep3; i++) {
            				System.out.print("33333");
            			}
            			System.out.print("\n");
            		}
            		else
            			System.out.println("-1");
            	}
            	//n is odd ex 13 = 7 + 6
            	else if(n%2 == 1) {
            		int n1 = n;
            		int n2 = n - n1;
            		int first = splitNumber(n1,n2);
            		int second = n - first; 
            		// ex 11 = 6 + 5
            		if( (first%3) == 0 && (second%5) == 0 && first>0) {
            			int rep5 = first / 3;
            			int rep3 = second / 5;
            			for(int i=0; i<rep5; i++) {
            				System.out.print("555");
            			}
            			for(int i=0; i<rep3; i++) {
            				System.out.print("33333");
            			}
            			System.out.print("\n");
            		}
            		// if first is divided by 5 ex 13 = 10 + 3
            		else if( (first%5) == 0 && (second%3) == 0 && first>0) {
            			int rep3 = first / 5;
            			int rep5 = second / 3;
            			for(int i=0; i<rep5; i++) {
            				System.out.print("555");
            			}
            			for(int i=0; i<rep3; i++) {
            				System.out.print("33333");
            			}
            			System.out.print("\n");
            		}
            		else
            			System.out.println("-1");
            	}
            	continue;
            }
            
        }

	}

	private static int splitNumber(int n1, int n2) {
		// TODO Auto-generated method stub
		// find one number divided by either 5 or 3	
		//System.out.println("N1:"+n1+"N2:"+n2);
		if(n1<0 || n2<0) {
			finalFirst = -1;
			return finalFirst;
		}
		if( (n1%5) == 0 ) {
			if((n2%3) == 0) {
				finalFirst = n1;
			} else {
				splitNumber(n1-1, n2+1);
			}
		} else if ( (n1%3) == 0 ) { 
			if ((n2%5) == 0) {
				finalFirst = n1;
			} else {
				splitNumber(n1-1, n2+1);
			}
		} else {
			splitNumber(n1-1, n2+1);
		}
		return finalFirst;
	}

}
