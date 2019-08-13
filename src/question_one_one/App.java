package question_one_one;

public class App {

	public static void main(String[] args) {
		System.out.println(uniqueChar("VictorV"));
		System.out.println(uniqueChar("Essssskeeet"));
		System.out.println(uniqueChar("V"));

	}
	
	public static boolean uniqueChar(String str) {
		// Assuming ASCII, we have 128 unique characters in the original set, 256 in the extended.
		// First we can check if given string is 128 characters or lower, if not we return false.
		if (str.length() > 128) return false;
		
		// If we can use a data structure, we can create a boolean array to flag each character.
		boolean[] char_set = new boolean[128];
		// Now we create a for loop to iterate through the string characters.
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
}
