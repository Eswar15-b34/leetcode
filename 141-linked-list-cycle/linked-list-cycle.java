/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode t = head;
        while(temp!=null && temp.next!=null)
        {
            temp=temp.next.next;
            t=t.next;
            if(temp==t)
            {
                return true;
            }
        }
        return false;
    }
}