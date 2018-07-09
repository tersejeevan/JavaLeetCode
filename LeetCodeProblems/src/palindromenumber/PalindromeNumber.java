package palindromenumber;

import java.util.Scanner;

public class PalindromeNumber {

	public void palindromeTest() {
	String original, reverse = ""; 
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a string/number to check if it is a palindrome"); 
    
    original = in.nextLine();
    
    int length = original.length();   
    
    for ( int i = length - 1; i >= 0; i-- )  {
       reverse = reverse + original.charAt(i);
    }
    if (original.equals(reverse)) {
    	
       System.out.println("Entered string/number is a palindrome.");  
    }
    else  
       System.out.println("Entered string/number is not a palindrome.");   
}
	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
		pn.palindromeTest();
	}

}