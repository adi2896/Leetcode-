/* 83. Remove Duplicates from Sorted List

Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) 
    {
        if (head == null || head.next == null) 
            return head;
        
        ListNode n = new ListNode();
        n = head;
        while(n.next != null)
        {
            if(n.val == n.next.val)
            {
                n.next = n.next.next;
            }
            else
            {
                n = n.next;
            }
        }
        
        return head;
    }
}