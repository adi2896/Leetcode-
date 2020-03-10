/* 242. Valid Anagram

Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.
*/

class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()==0 && t.length()==0) 
            return true;
        
        if(s.length()<t.length() || t.length()<s.length())
            return false;
        
        char[] sa = s.toCharArray();
        Arrays.sort(sa);
        s = String.copyValueOf(sa);
        char[] ta = t.toCharArray();
        Arrays.sort(ta);
        t = String.copyValueOf(ta);
        
        
        int res = s.compareTo(t);
        if(res==0)
            return true;
        
        return false;
    }
}