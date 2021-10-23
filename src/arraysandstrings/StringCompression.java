package arraysandstrings;

public class StringCompression {
	
	public static void append(StringBuilder s, char c, int count) {
		s.append(c);
		s.append(count);
	}
	
	public static String compress(String str) {
		if (str.length() < 2) return str;
		
		StringBuilder s = new StringBuilder("");
		int count = 1;
		
		for (int i = 1; i < str.length(); ++i) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				++count;
			} else {
				append(s, str.charAt(i), count);
				count = 1;
			}
		}
		
		append(s, str.charAt(str.length() - 1), count);
		
		return s.length() > str.length() ? s.toString() : str;
	}
	
	public static void main(String[] args) {
		String str = "aabbbbcccccc";
		System.out.println(str);
		System.out.println(compress(str));
	}
}
