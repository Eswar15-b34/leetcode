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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        ListNode t=head;
        int size=1;
        if(head==null)
        {
            return head;
        }
        while(temp.next!=null)
        {
            size++;
            temp=temp.next;
        }
        temp.next=head;
        int pos=size-(k%size);
        while(pos>0)
        {
            pos--;
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        System.out.println(size);
        return head;

        
    }
}