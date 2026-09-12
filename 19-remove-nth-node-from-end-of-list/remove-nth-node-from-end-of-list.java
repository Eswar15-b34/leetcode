/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode t = head;
        int s =0;
        while(t!=null)
        {
            s++;
            t=t.next;
        }
        if(n==s)
        {
            return head.next;
        }
        int p = s-n;
        if(p<1) return  null;
        else
        {
            ListNode nt = head;
            p=p-1;
            while(p>0)
            {
                p--;
                nt=nt.next;
            }
            nt.next=nt.next.next;
        }
        return head;

    }
}