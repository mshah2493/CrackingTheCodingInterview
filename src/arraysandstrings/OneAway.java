package arraysandstrings;

public class OneAway {
	public static boolean oneEditAway(String first, String second) {
		int firstLength = first.length();
		int secondLength = second.length();
		
		if (Math.abs(firstLength - secondLength) > 1) return false;

		String s1 = firstLength < secondLength ? first : second;
		String s2 = firstLength < secondLength ? second : first;

		int index1 = 0;
		int index2 = 0;
		
		boolean foundDifference = false;
		
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (foundDifference)
					return false;
				
				foundDifference = true;
				
				if (s1.length() == s2.length()) index1++;
			} else {
				index1++; 
			}
			
			index2++; 
		}
		
		return true;
	}

	public static void main(String[] args) {
		String a = "palee";
		String b = "pale";
		boolean isOneEdit1 = oneEditAway(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit1);

		String c = "pale";
		String d = "pkle";
		boolean isOneEdit2 = oneEditAway(c, d);
		System.out.println(c + ", " + d + ": " + isOneEdit2);
	}
}
