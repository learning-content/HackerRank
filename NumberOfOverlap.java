import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOfOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> start = new ArrayList<Integer>();
	    List<Integer> end = new ArrayList<Integer>();
	 
	    start.add(0);
	    start.add(1);
	    start.add(3);
	    start.add(4);
	    start.add(7);
	 
	    end.add(2);
	    end.add(5);
	    end.add(7);
	    end.add(6);
	    end.add(8);
	 
	    int result = numOverLaps(start, end);
	 
	    System.out.println("Result is " + result);
	}

	public static int numOverLaps(List<Integer> start, List<Integer> end) {
        if (start == null || start.size() == 0 || end == null || end.size() == 0) {
            return 0;
        }
         
        if (start.size() != end.size()) {
            return 0;
        }
         
        Collections.sort(start);
        Collections.sort(end);
         
        int startP = 0;
        int endP = 0;
         
        int numActive = 0;
        int numOverlap = 0;
         
        while (startP < start.size() && endP < end.size()) {
            if (start.get(startP) < end.get(endP)) {
                numActive++;
                numOverlap = Math.max(numOverlap, numActive);
                startP++;
            } else {
                numActive--;
                endP++;
            }
        }
        return numOverlap;
    }

}
