package arraysandstrings;

public class UniqueCharacters {
	public static boolean isUnique(String s) {
		boolean[] chars = new boolean[128];
		
		for (int i = 0; i < chars.length; ++i) {
			chars[i] = false;
		}
		
		for (char c : s.toCharArray()) {
			int val = c;
			if (chars[val]) return false;
			chars[val] = true;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String s = "Ab158392 @";
		System.out.print(isUnique(s));
	}
}
