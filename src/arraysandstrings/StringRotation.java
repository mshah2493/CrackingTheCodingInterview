package arraysandstrings;

public class StringRotation {
	public static boolean isRotation(String str1, String str2) {
		if (str1.length() != str2.length()) return false;
		
    	String str = str1 + str1;
    	
    	return isSubstring(str, str2);
	}
	
	public static boolean isSubstring(String str1, String str2) {
		if(str1.length() < str2.length()) return false;
		
	    if(str1.length() == str2.length()) return str1.equals(str2);
	    
	    for(int i = 0; i <= str1.length() - str2.length(); i++) {
	        if(str1.charAt(i) == str2.charAt(0)) {
	            int matchLength=1;
	            
	            for(int j = 1; j < str2.length(); j++) {
	                if(str1.charAt(i+j) != str2.charAt(j)) {
	                    break;
	                }
	                
	                matchLength++;
	            }
	            
	            if(matchLength == str2.length()) return true;
	        }
	    }
	    
	    return false;
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}
	}
}
