package arraysandstrings;

import java.util.Arrays;

public class URLify {
	public static int countChars(char[] c, int start, int end, char target) {
		int count = 0;
		
		while(start < end) {
			if (c[start] == target) ++count;
			++start;
		}
		
		return count;
	}
	public static void replaceSpaces(char[] c, int trueLength) {
		int totalSpaces = countChars(c, 0, trueLength, ' ');
		int newIndex = trueLength - 1 + totalSpaces * 2;
		
		if (newIndex + 1 < trueLength) c[newIndex + 1] = '\0';
		
		for (int i = newIndex - 1; i > -1; --i) {
			if (c[newIndex] == ' ') {
				c[newIndex] = '0';
				c[newIndex - 1] = '2';
				c[newIndex - 2] = '%';
				
				newIndex -= 3;
			} else {
				c[newIndex] = c[i];
				--newIndex;
			}
		}
	}
	
	public static void main(String[] args) {
		char[] c = {'M', 'r', ' ', 'J', 'O', 'H', 'N', ' ', 'S', 'M', 'I', 'T', 'H', ' ', ' ', ' ', ' '};
		replaceSpaces(c, 13);
		System.out.println(Arrays.toString(c));
	}
}
