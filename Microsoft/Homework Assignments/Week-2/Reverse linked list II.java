class Solution {
public ListNode reverseBetween(ListNode head, int left, int right) {
ListNode prev=null;
ListNode current=head;
for(int i=0;current!=null&&i<left-1;i++){
prev=current;
current= current.next;
}
ListNode last=prev;
ListNode end=current;
ListNode Next=current.next;
for(int i=0;current!=null&&i<right-left+1;i++){
current.next=prev;
prev=current;
current=Next;
if(Next!=null){
Next=Next.next;
}
}

    if(last!=null){
        last.next=prev;
        }else{head=prev;}
    end.next=current;
    return head;
    
    
}
}
