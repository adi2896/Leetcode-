/*349. Intersection of Two Arrays

Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        
        for(int i=0; i<nums1.length; i++)
        {
            s1.add(nums1[i]);
        }
        
        for(int j=0; j<nums2.length; j++)
        {
            s2.add(nums2[j]);
        }
        
        s1.retainAll(s2);
        return s1.stream().mapToInt(Integer::intValue).toArray();
    }
}