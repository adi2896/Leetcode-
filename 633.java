/*633. Sum of Square Numbers
Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.

Example 1:

Input: 5
Output: True
Explanation: 1 * 1 + 2 * 2 = 5
 

Example 2:

Input: 3
Output: False
*/


class Solution {
    public boolean judgeSquareSum(int c) 
    {
        int sq;
        int n;
        int op;

        if(c==0)
            return true;
                
        for(int i = 1; i <= (int)Math.sqrt(c); i++)
        {
            sq = i*i;
            n = c - sq;
            op = (int)Math.sqrt(n);
            if(sq + (op*op) == c)
                return true;
        }
        
        
        return false;
    }
}