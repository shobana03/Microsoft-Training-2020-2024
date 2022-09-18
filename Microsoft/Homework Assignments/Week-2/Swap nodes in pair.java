class Solution {
public ListNode swapPairs(ListNode head) {

if(head == null){
    return null;
}else if(head.next == null){
    return head;
}
    ListNode odd= head;
    ListNode even= head.next;
    ListNode temp = null;
    head = head.next;
    while(odd != null && even != null){
        odd.next = even.next;
        even.next = odd;
        if(temp != null){
            temp.next = even;
        }
        temp = odd;
        odd = odd.next;
        if(odd == null){
            even = null;
        }else{
            even = odd.next;
        }
    }
    return head;
}
}
