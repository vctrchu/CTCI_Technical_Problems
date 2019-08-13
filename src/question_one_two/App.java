package question_one_two;

public class App {

	public static void main(String[] args) {
		//System.out.println(permutation_1("god", "cat"));
		System.out.println(permutation_2("god", "dog"));

	}
	
	// Solution #1: We can sort the strings and then compare them
	public static boolean permutation_1(String s, String t) {
		if (s.length() != t.length()) return false;
		return (sort(s).equals(sort(t)));
	}
	
	public static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	//Solution #2: We want to find two strings with the same character counts.
	public static boolean permutation_2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		// Create an array to the number of times a character shows up in a the string.
		int[] letters = new int[128]; // Assume it is 128 ascii letter set
		
		// Create array of characters of the strings.
		char[] s_array = s.toCharArray();
		for (char c: s_array) { // Enhanced for loop for iterating through arrays
			letters[c]++;
		}
		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i); // Convert characters to ascii value
			letters[c]--;
			if (letters[c] < 0) {
				return false;
			}
		}
		return true;
	}
	


}
