/* Detect Capital
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 

Example 1:

Input: "USA"
Output: True
 

Example 2:

Input: "FlaG"
Output: False
 

Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
*/

class Solution {
    public boolean detectCapitalUse(String word) 
    {
        char[] arr = word.toCharArray();
        int length = arr.length;
        int counter = 0;
        
        if(length == 0 || length == 1)
            return true;
        
        if(length == 2)
        {
            if(Character.isUpperCase(arr[0]) && Character.isUpperCase(arr[1]))
                return true;
            
            if(Character.isUpperCase(arr[0]) && !Character.isUpperCase(arr[1]))
                return true;
            
            if(!Character.isUpperCase(arr[0]) && !Character.isUpperCase(arr[1]))
                return true;
            
            else
                return false;
        }
        
        if(length>2)
        {
            //All capital
            if(Character.isUpperCase(arr[0]) && Character.isUpperCase(arr[1]))
            {
                for(int i=2; i<arr.length; i++)
                {
                    if(Character.isLowerCase(arr[i]))
                        counter++;
                }
                if(counter == 0)
                    return true;
            }
            
            //All small
            if(Character.isLowerCase(arr[0]))
            {
                for(int i=1; i<arr.length; i++)
                {
                    if(Character.isUpperCase(arr[i]))
                        counter++;
                }
                if(counter == 0)
                    return true;
            }
            
            //First letter capital
            if(Character.isUpperCase(arr[0]) && Character.isLowerCase(arr[1]))
            {
                for(int i=2; i<arr.length; i++)
                {
                    if(Character.isUpperCase(arr[i]))
                        counter++;
                }
                if(counter == 0)
                    return true;
            }           
        }
        return false;
    }
}