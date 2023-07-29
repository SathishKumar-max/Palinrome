package org.pali;

public class palindromeProgram {

	public static void main(String args[]) {
		int n = 333;
		int sum = 0;
        int rev = n;
      
        while (n > 0) {
    		sum = (n % 10)+(sum*10);
    		n = n / 10;
    		}
       
		if (rev == sum)
			System.out.println( rev+" : palindrome number ");
		else
			System.out.println(rev +" : not palindrome");
	}
}
