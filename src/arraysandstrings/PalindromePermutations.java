package arraysandstrings;

public class PalindromePermutations {
	public static int getCharNumber(char c) {
		if (c >= 'a' && c <= 'z') {
			return c - 'a';
		} else if (c >= 'A' && c <= 'Z') {
			return c - 'A';
		} 
		
		return -1;
	}
	
	public static boolean isPermutationOfPalindrome(String s) {
		int[] charCount = new int[53];
		int count = 0;
		
		for (char c : s.toCharArray()) {
			int val = getCharNumber(c);
			
			if (val != -1) {
				++charCount[val];
				
				if (charCount[val] % 2 == 1) {
					++count;
				} else {
					--count;
				}
			}
		}
		
		return count < 2;
	}
		
	public static void main(String[] args) {
		String s = "Tact Coa";
		System.out.println(isPermutationOfPalindrome(s));
	}
}
