/*136. Single Number

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/

class Solution 
{
    public int singleNumber(int[] nums) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int op = 0;
        int count = 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i], count+1);
            }
                
            else
                hm.put(nums[i], count);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }
        
        return -1; 
    }
}