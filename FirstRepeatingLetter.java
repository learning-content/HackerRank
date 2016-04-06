
public class FirstRepeatingLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstRepeatingLetter("abcba"));
	}

	static String firstRepeatingLetter(String s) {
		if (s.length() >= 256 || s.equals(null))
			return "Invalid String";
		
		char[] charArray = s.toCharArray();
		int length = charArray.length;
		
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(charArray[i] == charArray[j]) {
					String answer = String.valueOf(charArray[i]);
					return answer;
				}
			}
		}
		return null;
    }
}
