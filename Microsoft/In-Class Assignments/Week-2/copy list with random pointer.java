class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node res = new Node(-1);
        Node result = res;
        Node temp = head;
        
        while(temp!=null){
            int val = temp.val;
            res.next = new Node(val);
            res = res.next;
            map.put(temp,res);
            temp = temp.next;
        }
        
        temp = head;
        res = result.next;
        while(temp!=null){
            Node random = temp.random;
            if(random!=null){
                res.random = map.get(random);
            }
            temp = temp.next;
            res = res.next;
        }
        
        return result.next;
    }
}
