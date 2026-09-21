/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        ListNode t= headB;
        while(temp!=t)
        {
            if(temp==t)
            {
                break;
            }
            if(temp==null)
            {
                temp = headB;
            }
            else
            {
                temp=temp.next;
            }
           if(t==null)
           {
            t= headA;
           }
           else
           {
            t=t.next;
           }
        }
        return temp;
    }
    
}