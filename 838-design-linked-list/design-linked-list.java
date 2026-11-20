class Node
{
    int val ;
    Node next;
    Node(int val)
    {
        this.val = val ;
        next = null;
    }
}
class MyLinkedList {
     Node head;
     int size;
    public MyLinkedList() {
        head = null;
        size=0;
    }
    
    public int get(int i) {
        if(i>=size) {
            return -1;
        }
        Node temp = head;
        for(int j=0 ;j<i;j++)
        {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next=head;
        head=n;
        size++;
    }
    
    public void addAtTail(int val) {
        Node n = new Node(val);
        if(head==null)
        {
            head=n;
            size++;
            return ;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next= n;
        size++;
    }
    
    public void addAtIndex(int i, int val) {
        if(i>size) 
        {
            return ;
        }
        if(i==0)
        {
            addAtHead(val);
            return ;
        }
        if(i==size)
        {
            addAtTail(val);
            return ;
        }
        Node n = new Node(val);
        Node temp = head;
        for(int j=0 ;j<i-1;j++)
        {
            temp = temp .next;
        }
        n.next=temp.next;
        temp.next=n;
        size++;
        
    }
    
    public void deleteAtIndex(int i) {
        if(i>=size)
        {
            return ;
        }
        if(i==0)
        {
            head=head.next;
            size--;
            return ;
        }
        Node temp =head;
        for(int j=0 ;j<i-1;j++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */