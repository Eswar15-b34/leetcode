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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode k = new ListNode(0);
        ListNode t= k;
        ListNode temp = list1;
        ListNode temp2 = list2;
        while(temp!=null && temp2!=null)
        {
            if(temp.val>=temp2.val)
            {
                
                t.next=temp2;
                temp2=temp2.next;
                
            }
            else
            {
                t.next=temp;
                temp=temp.next;
            }
            t=t.next;
        }
        while(temp!=null)
        {
            t.next=temp;
                temp=temp.next; 
                t=t.next;
        }
        while(temp2!=null)
        {
             t.next=temp2;
                temp2=temp2.next;
                t=t.next;
        }
        return k.next;
    }
}