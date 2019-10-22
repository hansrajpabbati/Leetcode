package Q_2_LongSubWoRepetingChar;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcabcbb";
		int b = lengthOfLongestSubstring(a);
		int c = lengthOfLongestSubstring1(a);
		System.out.println("set "+b + " logic " + c);
		

	}
//using set	
	public static int lengthOfLongestSubstring1(String s) {
	int n = s.length();
    Set<Character> set = new HashSet<>();
    int ans = 0, i=0, j=0;
    
    while(i<n && j<n)
    {
        if(!set.contains(s.charAt(j)))
        {
            set.add(s.charAt(j));
            j++;
            ans = Math.max(ans, j-i);
        }
        else
        {
            set.remove(s.charAt(i));
            i++;
        }
    }
    return ans;
	}
	
	//using logic
	 public static int lengthOfLongestSubstring(String s) {
		 
		 if(s.length() == 0) {
			 return 0;
		 }
		 
		 int max =0;
		 int end =0;
		 int start =0;
		 int[] count = new int[256];
		 
		 while(end < s.length()) {
			 if(count[s.charAt(end)] == 0) {
				 count[s.charAt(end)]++;
			 }else {
				 while(count[s.charAt(end)] != 0) {
					 count[s.charAt(start)]--;
					 start++;
				 }
				 count[s.charAt(end)]++;
			 }
			 max = Math.max(max, end-start+1);
			 end++;
		 }
		 
		 
		 return max;
	 }
	
	


}
