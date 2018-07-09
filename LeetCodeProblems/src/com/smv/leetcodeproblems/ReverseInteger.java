package com.smv.leetcodeproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseInteger {
	
	  

	/*  public int reverseInteger(int x) {
	    	;
	        int reverseint = 0;
	        while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (reverseint > Integer.MAX_VALUE/10 || (reverseint == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	            if (reverseint < Integer.MIN_VALUE/10 || (reverseint == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	            reverseint = reverseint * 10 + pop;
	        }
	        return reverseint;
	    }
	    
	  //  public static void main(String[] args) {
			//ReverseInteger ri = new ReverseInteger();
			//ri.reverseInteger();
		//} */
 
	/*public int reverse(int x) {
	    int y = 0;
	    for (int i = 0; i < 32; ++i) {
	        y <<= 1;       // make space
	        y |= (x & 1);  // copy LSB of X into Y
	        x >>>= 1;      // shift X right
	    }
	    return y;
	}

	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		int x = 0;
		ri.reverse(x);
	}*/	    public static void main(String[] args)
	    {
		
		ReverseInteger ri = new ReverseInteger();
		ri.stringReverse();
		
	    }
	
	public void stringReverse() {
	        String input = "ABCDEFGH";
	        char[] hello = input.toCharArray();
	        List<Character> trial1 = new ArrayList<>();
	 
	        for (char c: hello)
	            trial1.add(c);
	 
	        Collections.reverse(trial1);
	        ListIterator li = trial1.listIterator();
	        while (li.hasNext())
	            System.out.print(li.next());
	    }
	}



