package org.pali;


public class palindromewithscanner {

	public static void main(String args[]) {
		String original = "oppo";
		String reverse = "";
		
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			
			reverse = reverse + original.charAt(i);
	
		
		if (reverse.equals(original))
			System.out.println(reverse+" : is a palindrome.");
		else
			System.out.println(reverse+" : is not a palindrome.");
	}
	
}
}