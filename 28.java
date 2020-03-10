/*Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

If needle is an empty string then return 0.
*/

class Solution {
    public int strStr(String haystack, String needle) 
    {
        if(needle.isEmpty())
        {
            return 0;
        }
        
        if(haystack.contains(needle))
            return haystack.indexOf(needle);
        else
            return -1;
        
    }
}