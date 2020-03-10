/* 1358. Number of Substrings Containing All Three Characters
Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 

Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
Example 3:

Input: s = "abc"
Output: 1
 

Constraints:

3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters.
*/


class Solution {
    public int numberOfSubstrings(String s) 
    {   
        //Brute Force solution
//         int counter = 0;
//         for (int i = 0; i < s.length(); i++) 
//         {
//             for (int j = i+1; j <= s.length(); j++) 
//             {
//                 if(s.substring(i,j).contains("a") && s.substring(i,j).contains("b") &&                              s.substring(i,j).contains("c"))                                               
//                 {
//                     counter++;
//                 }
//             }
//         }
        
//         return counter;
        
        
        
        //O(n) solution
        
        int count = 0;
        HashMap<Character, Integer> map = new HashMap();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, i);
            if(map.size() == 3) {
                int minIndex = Math.min(map.get('a'), map.get('b'));
                minIndex = Math.min(minIndex, map.get('c'));
                count += minIndex + 1;
            }
        }
        return count;
    }
}