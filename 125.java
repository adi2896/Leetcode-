/* 125. Valid Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
*/

class Solution {
    public boolean isPalindrome(String s) 
    {
        if(s.length() == 0)
            return true;
        
        s = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb = sb.reverse();
        System.out.print(sb);
        String ns = sb.toString();
        int res = s.compareTo(ns);
        if(res == 0)
            return true;
        
        return false;
    }
}