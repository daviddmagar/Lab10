/**
 * CS 2003 - Lab 10 Code to find palindrome created from the product of two four digit numbers
 *
 * @author David Magar
 * @version 1.0
 * @since 10-31-2017
 */

public class PalindromeProduct {
	

	//reused code from Lab5
	public static boolean isaPalindrome(String x)
	{
		x = x.toLowerCase();
		int length = x.length();
		if(x.equals("") || x.length()==1) return true;
		if(x.length() > 0) 
		{
			if(x.charAt(0) == x.charAt(length-1))
			{
				if(x.length() == 3) {
					if(x.charAt(0) == x.charAt(length-1)) {
						return true;
					}
					else
						return false;
					
				}
				return(isaPalindrome(x.substring((1), (length-1))));
				
			}
			
			else if(x.charAt(0) != x.charAt(length-1)) {
				return false;
				
			}
					
		}
		return false;
		}
	
	//Method to multiply every number to find largest  
	public static int multiplyNums() {
		int product = 0;
		int largestProduct = 0;
		int first = 0;
		int last = 0;
		String passProduct = "";
		
		for(int x = 0; x <= 9999; x++) {
			for(int y = 0; y <= 9999; y++) {
				product = x*y;
				passProduct = Integer.toString(product);
				//check to see if the product is a palindrome
				if(isaPalindrome(passProduct)) {
					//if the product is largest than our current leader, store it
					if(product > largestProduct) {
						largestProduct = product;
						first = x;
						last = y;
					}
					
					}
				
				}
				
				
			}
		System.out.printf("The product of %d and %d is %d\n", first, last, largestProduct );
		return largestProduct;
		}
			
	

	public static void main(String[] args) {
		int largestPalindrome = multiplyNums();
		System.out.println("The largest palindrome is: " + largestPalindrome);

	}

}
