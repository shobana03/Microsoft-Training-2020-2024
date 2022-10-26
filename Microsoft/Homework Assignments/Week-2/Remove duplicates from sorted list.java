class Solution {
public ListNode deleteDuplicates(ListNode head) {
ListNode curr= head;
if(head==null)
{
return head;
}
ListNode curr2=head.next;
while(curr2!=null)
{
if(curr.val==curr2.val)
{
curr.next=curr2.next;
curr2=curr2.next;
}
else{
curr=curr2;
curr2=curr2.next;
}
}
return head;
}
}
