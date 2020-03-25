/* 504. Base 7
Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"
Example 2:
Input: -7
Output: "-10"
Note: The input will be in range of [-1e7, 1e7].
*/


class Solution 
{
    public String convertToBase7(int num) 
    {
        int base  = 7;
        int r = 0;
        int i = 0;
        int out = 0;
        while(num != 0)
        {
            r = num % 7;
            num = num / 7;
            out = out + (r * (int)Math.pow(10, i));
            i++;
        }
        return Integer.toString(out);
    }
}