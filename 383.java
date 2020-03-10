/*383. Ransom Note
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/

class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        if((ransomNote == null && magazine != null) || (ransomNote == null && magazine == null))
        {
            return true;
        }
        
        else if(ransomNote != null && magazine == null)
        {
            return false;
        }
        
        Map<Character,Integer> r = new HashMap<>();
        Map<Character, Integer> m = new HashMap<>();
        
        for(int i = 0 ; i<ransomNote.length() ; i++)
        {
            if(!r.containsKey(ransomNote.charAt(i)))
            {
                r.put(ransomNote.charAt(i),1);
            }
            else
            {
                r.replace(ransomNote.charAt(i), r.get(ransomNote.charAt(i))+1);
            }
        }
        
        for(int i = 0 ; i<magazine.length() ; i++)
        {
            if(!m.containsKey(magazine.charAt(i)))
            {
                m.put(magazine.charAt(i),1);
            }
            else
            {
                m.replace(magazine.charAt(i), m.get(magazine.charAt(i))+1);
            }
        }
        
        for(int i = 0 ; i<ransomNote.length() ; i++)
        {
            if(!m.containsKey(ransomNote.charAt(i))) 
            {
                return false;
            }
            else if(m.get(ransomNote.charAt(i)) < r.get(ransomNote.charAt(i)))
            {
                return false;
            }
        }
        
        return true;  
    }
}