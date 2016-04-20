import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindFirstRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicate("abcdefghijklmnopqrstuvwxyzz");
	}

	/*
	 * first duplicate 
	 * public static void findDuplicate(String s) {
	 * char[] chars = s.toCharArray(); Set<Character> uniqueChars = new
	 * HashSet<Character>(chars.length, 1); for (int i = 0; i < chars.length;
	 * i++) { if (!uniqueChars.add(chars[i])) { System.out.println(s.charAt(i));
	 * break; } } }
	 */

	/*
	 * first appearance 
	 * public static void findDuplicate(String s) {
	 * char[] chars = s.toCharArray(); Map<Character, Integer> uniqueChars = new
	 * HashMap<Character, Integer>(chars.length, 1); for (int i = 0; i <
	 * chars.length; i++) { Integer previousIndex = uniqueChars.put(chars[i],
	 * i); if (previousIndex != null) {
	 * System.out.println(s.charAt(previousIndex)); break; } }
	 * System.out.println(uniqueChars.size()); }
	 */

	public static void findDuplicate(String source) {
		int[] firstOccurrence = new int[1 << Character.SIZE];
		Arrays.fill(firstOccurrence, -1);
		for (int i = 0; i < source.length(); i++) {
			char ch = source.charAt(i);
			if (firstOccurrence[ch] != -1)
				System.out.println(source.charAt(firstOccurrence[ch]));
			else
				firstOccurrence[ch] = i;
		}
	}

}
