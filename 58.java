/*  Length of Last Word
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5
*/

class Solution {
    public int lengthOfLastWord(String s) 
    {
        int op;
        s=s.trim();
        if(s.length() == 0 || s == null)
             return 0;
        int p=s.lastIndexOf(' ');
        if(p==-1)
            return s.length();
        else
        {            
            String[] arr = s.split(" ");
            int l = arr.length;
            String ss = arr[l-1];
            System.out.print(ss);
            op = ss.length();
        }
         return op;
    }
}