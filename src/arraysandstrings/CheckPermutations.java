package arraysandstrings;

public class CheckPermutations {
	public static boolean isPermutation(String s1, String s2) {
		int[] chars = new int[128];
		
		for (char c : s1.toCharArray()) {
			int val = c;
			++chars[val];
		}
		
		for (char c : s2.toCharArray()) {
			int val = c;
			--chars[val];
			
			if (chars[val] < 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "cba";
		System.out.print(isPermutation(s1, s2));
	}
}
