class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode left=dummy,right=dummy;
        for(int i=1;i<=n+1;i++){
            right=right.next;
        }
        while(right!=null){
            left=left.next;
            right=right.next;
        }
        left.next=left.next.next;
        return dummy.next;
    }
}
