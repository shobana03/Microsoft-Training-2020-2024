class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;    
    int front;

    public MyQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(s1.empty()) {
            front = x;           
        }
        s1.push(x);
    }
    
    public int pop() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public int peek() {
        if(!s2.isEmpty()) {
            return s2.peek();
        }
        return front;
    }
    
    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}  
