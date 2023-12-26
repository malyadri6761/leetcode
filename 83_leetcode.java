class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode temp=head;
        ListNode temp1=head.next;
        while(temp!=null && temp1!=null){
            if(temp.val!=temp1.val){
                temp.next=temp1;
                temp=temp1;
            }
            temp1=temp1.next;
        }   
        temp.next=null; 
        return head;
    }
}
