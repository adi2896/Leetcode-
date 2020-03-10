/*66. Plus One
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/

class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int[] sol = new int[digits.length+1];
        int len = digits.length;
        digits[len-1]+=1;
        for (int i = len - 1; i >= 0; i--) 
        {
            if (digits[i] >= 10) 
            {
                digits[i]%=10;
                if (i > 0) 
                {
                    digits[i-1]+=1;
                }
                else 
                {
                    System.arraycopy(digits,0,sol,1,digits.length);
                    sol[0]=1;
                    return sol;
                }
            }
        } 
        return digits;
    }
}