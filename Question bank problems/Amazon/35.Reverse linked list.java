class Solution {
    public ListNode reverseList(ListNode head) {
        // iterative and recursive
        if(head==null || head.next==null) {
            return head;
        }
        // split curr head node and remaining list
        ListNode next = head.next;
        head.next = null;
        // reverse the remaining list
        ListNode reversed = reverseList(next);
        // build new list
        next.next = head;
        return reversed;
    }
}
