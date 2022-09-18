class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val = 0;
            if (l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }
            val += carry;
            carry = val / 10;
            val = val % 10;
            ListNode nextNode = new ListNode(val);
            temp.next = nextNode;
            temp = temp.next;
        }
        if (carry != 0) {
            ListNode nextNode = new ListNode(carry);
            temp.next = nextNode;
        }
        return head.next;
    }
}
