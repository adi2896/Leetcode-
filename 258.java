/* 258. Add Digits
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
Since 2 has only one digit, return it.
*/

class Solution 
{
    public int addDigits(int num) 
    {
        int temp;
        int sum = 0;
        if(num <= 9)
            return num;
        
        while(num>9)
        {
            sum = 0;
            while(num != 0)
            {
                temp = num%10;
                sum = sum + temp;
                num = num/10;
            }
            num = sum;
        }
        return sum;       
   }
}