public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast =fast.next.next;
            if(slow==fast){
                ListNode otherSlow=head;
                while(slow!=otherSlow){
                    slow=slow.next;
                    otherSlow=otherSlow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
