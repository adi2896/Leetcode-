/* 206. Reverse LinkedList
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
*/

class Solution 
{
   public ListNode reverseList(ListNode head) 
   {
     Stack<ListNode> nodes = new Stack<>();
    ListNode node = head;
    while (node != null) 
    {
        nodes.push(node);
        node = node.next;
    }

    head = null;
    while (!nodes.empty()) 
    {
        ListNode temp = nodes.pop();
        if (head == null) 
        {
            head = temp;
        }
        if (!nodes.empty()) 
        {
            temp.next = nodes.peek();
        } 
        else 
        {
            temp.next = null;
        }
    }
    return head;
    }
}