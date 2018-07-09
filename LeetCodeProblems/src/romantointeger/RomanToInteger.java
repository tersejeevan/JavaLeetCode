package romantointeger;

public class RomanToInteger {

	 int value(char r)
	    {
	        if (r == 'I')
	            return 1;
	        if (r == 'V')
	            return 5;
	        if (r == 'X')
	            return 10;
	        if (r == 'L')
	            return 50;
	        if (r == 'C')
	            return 100;
	        if (r == 'D')
	            return 500;
	        if (r == 'M')
	            return 1000;
	        return -1;
	    }
	 
	    int romanToDecimal(String str)	 // Finds decimal value of a given roman numeral
	    {
	        int res = 0;	       // Initialize result
	        for (int i=0; i<str.length(); i++)
	        {
	            
	            int roman1 = value(str.charAt(i));	// Getting value of symbol s[i]
	 
	           
	            if (i+1 <str.length())	 // Getting value of symbol s[i+1]
	            {
	                int roman2 = value(str.charAt(i+1));
	 
	                 if (roman1 >= roman2)	// Comparing both values
	                {
	                   
	                    res = res + roman1;	 // Value of current symbol is greater	// or equalto the next symbol
	                    
	                }
	                else
	                {
	                    res = res + roman2 - roman1;
	                    i++; // Value of current symbol is
	                    // less than the next symbol
	                }
	            }
	            else
	            {
	                res = res + roman1;
	                i++;
	            }
	        }
	 
	        return res;
	    }
	    
	    
	    public static void main(String[] args) {
	    	RomanToInteger ri = new RomanToInteger();
	    	 
	        String str = "MCMIV";			// Considering inputs given are valid
	        System.out.println("Integer form of Roman Numeral" +
	                           " is " + ri.romanToDecimal(str));
		}    
}
