package com.smv.validpparanthesis;

import java.util.Stack;

public class ValidPranthesis {

	public static boolean isValid(String s) {
		char arr[] = s.toCharArray();
		Stack<Character> set = new Stack();
		for (Character ch : arr) {
			if (ch == '{' || ch == '[' || ch == '(') {
				set.push(ch);
			} else if (ch == ']') {
				if (set.isEmpty() || set.peek() != '[') {
					return false;
				} 
				set.pop();
			} else if (ch == ')') {
				if (set.isEmpty() ||  set.peek() != '(') 
					return false;
				set.pop();	
			} else if (ch == '}') {
				if (set.isEmpty() ||  set.peek() != '{') 
					return false;
				set.pop();	
	
			}
		}
		return false;
	}
	
	public static void main(String[] args, String s) {
			
			System.out.println(isValid("{}[]"));
			System.out.println(isValid("{[}]"));
			System.out.println(isValid("[{}]"));
			
			ValidPranthesis vp = new ValidPranthesis();
			vp.isValid(s);
	
}
}
