import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CutStick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++){
			list.add(s.nextInt());
		}
		
		Collections.sort(list);
		
		while(list.size() > 0) {
			int smallest = list.get(0);
			for(int i=0; i<list.size(); i++) {
				list.set(i, list.get(i)-smallest);
			}
			System.out.println(list.size());
			list.removeAll(Collections.singleton(0));
		}

	}

}
