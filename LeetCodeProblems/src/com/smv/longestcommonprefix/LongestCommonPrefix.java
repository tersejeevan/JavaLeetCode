package com.smv.longestcommonprefix;

public class LongestCommonPrefix {

	static int findMinLength(String arr[], int n) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= (n - 1); i++) {
			if (arr.length < min) {
				min = arr[i].length();
			}
		}
		return min;
	}

	static boolean allContainsPrefix(String arr[], int n, String str, int start, int end) {
		for (int i = 0; i <= (n - 1); i++) {
			String arr_i = arr[i];

			for (int j = start; j <= end; j++) {
				if (arr_i.charAt(j) != str.charAt(j)) {
				}
			}

		}
		return false;
		
	}

	// A Function that returns the longest common prefix
	// from the array of strings
	static String commonPrefix(String arr[], int n) {
		int index = findMinLength(arr, n);
		String prefix = ""; // Our resultant string

		// We will do an in-place binary search on the
		// first string of the array in the range 0 to
		// index
		int low = 0, high = index;
		while (low <= high) {
			{

				// Same as (low + high)/2, but avoids
				// overflow for large low and high
				int mid = low + (high - low) / 2;

				if (allContainsPrefix(arr, n, arr[0], low, mid)) {
					// If all the strings in the input array
					// contains this prefix then append this
					// substring to our answer
					prefix = prefix + arr[0].substring(low, mid - low + 1);

					// And then go for the right part
					low = mid + 1;
				} else // Go for the left part
				{
					high = mid - 1;
				}
			}

		}
		return prefix;
	}

	// Driver program to test above function
	public static void main(String args[]) {
		String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
		int n = arr.length;

		String ans = commonPrefix(arr, n);

		if (ans.length() > 0)
			System.out.println("The longest common" + " prefix is " + ans);
		else
			System.out.println("There is no common" + " prefix");
	}
}
