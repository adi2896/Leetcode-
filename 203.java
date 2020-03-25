/* 203. Remove Linked List Elements
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
*/

class Solution {
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode n = new ListNode(0);
        ListNode nHead = n;
        n.next = head;
        
        while(n != null && n.next != null)
        {
            if(n.next.val == val)
            {
                n.next = n.next.next;
            }
            else
                n = n.next;
        }
        return nHead.next;  
    }
}