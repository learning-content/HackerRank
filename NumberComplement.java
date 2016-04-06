
public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getIntegerComplement(98112));

	}

	static int getIntegerComplement(int n) {
//		int ans = (Integer.highestOneBit(n) << 1) - 1;
//		return n ^ ans;
		String binary = Integer.toBinaryString(n);
		String temp = "";
		for(char c : binary.toCharArray()) {	// check every char
			if(c == '1')
				temp = temp + 0;	// if character 1 then make it 0 and concat to temp string
			else
				temp = temp + 1;	// if character 0 then make it 1 and concat to temp string
		}
		int base = 2;
		int answer = Integer.parseInt(temp, base);	// make answer decimal
		return answer;
    }
}
