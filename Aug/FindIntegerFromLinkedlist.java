class ListNode {
    int val;
    ListNode next;
    ListNode(int data){
        this.val=data;
    }
}
public class FindIntegerFromLinkedlist {
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }
        ListNode prev=null;
        ListNode current=head;
        ListNode next_node=null;
        while(current!=null){
            next_node=current.next;
            current.next=prev;
            prev=current;
            current=next_node;
        }
        // now prev is new head
        int ans=0;
        int pow=0;
        while(prev!=null){
            if(prev.val==1){
                ans+=(1<<pow);
            }
            pow++;
            prev=prev.next;
        }
        return ans;
    }

    public int getDecimalValueOptimal(ListNode head) {
        if(head==null){
            return 0;
        }
        int result=0;
        while(head.next!=null){
            result=(result<<1) | head.val;
            head=head.next;
        }
        return result;
    }
    public static void main(String[] args) {
        FindIntegerFromLinkedlist obj=new FindIntegerFromLinkedlist();
        ListNode head=new ListNode(1);
        head.next=new ListNode(0);
        head.next.next=new ListNode(1);

        System.err.println(obj.getDecimalValue(head));
    }
}
