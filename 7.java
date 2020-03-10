/* Reverse Integer
Input: 123
Output: 321

Input: -123
Output: -321
*/

class Solution {
    public int reverse(int x) 
    {
        long j;
        if(x<=Math.pow(-2,31) || x>=(Math.pow(2,31)-1))
        {
            return 0;
        }
        else
        {
             int y = Integer.signum(x);
             String s = Integer.toString(Math.abs(x));
             StringBuilder ip = new StringBuilder();
             ip.append(s);
             ip = ip.reverse();
             s = ip.toString();
             j = Long.parseLong(s); 
             if(j<Math.pow(-2,31) || j>(Math.pow(2,31)-1))
             {
                return 0;
             }
            else
                return (int)j*y;
        }
    }
}