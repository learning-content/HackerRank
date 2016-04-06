import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.swing.text.AbstractDocument.LeafElement;

public class MarsColonists {

	public static void main(String args[]) {
		Integer a[] = new Integer[10];
		Integer m[] = new Integer[] { 1, 2, 3, 4, 3, 2 };
		Integer f[] = new Integer[] { 1, 2, 3, 3 };
		a = sortIntersect(f, m);
		for (int cur : a) {
			System.out.println(cur);
		}
	}

	static Integer[] sortIntersect(Integer[] f, Integer[] m) {
		Integer[] arrayToHash;
		Integer[] arrayToSearch;

		if (f.length < m.length) {
			arrayToHash = f;
			arrayToSearch = m;
		} else {
			arrayToHash = m;
			arrayToSearch = f;
		}

		HashSet<Integer> intersection = new HashSet<Integer>();

		HashSet<Integer> hashedArray = new HashSet<Integer>();
		for (Integer entry : arrayToHash) {
			hashedArray.add(entry);
		}

		for (Integer entry : arrayToSearch) {
			if (hashedArray.contains(entry)) {
				intersection.add(entry);
			}
		}

		return intersection.toArray(new Integer[0]);
	}

	public static int[] unionArrays(int[]... arrays) {
		int maxSize = 0;
		int counter = 0;

		for (int[] array : arrays)
			maxSize += array.length;
		int[] accumulator = new int[maxSize];

		for (int[] array : arrays)
			for (int i : array)
				if (!isDuplicated(accumulator, counter, i))
					accumulator[counter++] = i;

		int[] result = new int[counter];
		for (int i = 0; i < counter; i++)
			result[i] = accumulator[i];

		return result;
	}

	public static boolean isDuplicated(int[] array, int counter, int value) {
		for (int i = 0; i < counter; i++)
			if (array[i] == value)
				return true;
		return false;
	}

}
