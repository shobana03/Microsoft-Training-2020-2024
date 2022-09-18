class MinStack {

    int top, min_top, size;
    int[] stack, min_stack;
    public MinStack() {
        this.size = 10000;
        this.top = -1;
        this.min_top = -1;
        this.stack = new int[10000];
        this.min_stack = new int[10000];
    }
    
    public void push(int val) {
         if(!isFull()) {
             this.top += 1;
             this.stack[this.top] = val;
             if(!isMinStackFull()){
                 minPush(val);
             }
         }
    }
    
    public void minPush(int val) {
        if(this.isMinStackEmpty()) {
             this.min_top += 1;
            this.min_stack[this.min_top] = val;
        } else {
            int min_top_val = this.isMinStackEmpty() ? -1:min_stack[this.min_top];
            this.min_top += 1;
            if(val < min_top_val) {
                this.min_stack[this.min_top] = val;
            } else {
                this.min_stack[this.min_top] = min_top_val;
            }
        }
    }
    
    public void pop() {
        if(!this.isEmpty()){
            this.top-=1;
        }
        if(!this.isMinStackEmpty()) {
              this.min_top -= 1;
         }
    }
    
    public int top() {
        return isEmpty() ? -1:this.stack[top];
    }
    
    public int getMin() {
        return isMinStackEmpty() ? -1:this.min_stack[min_top];
    }
    
     public boolean isEmpty() {
        return this.top == -1;
    }
    
    public boolean isFull() {
        return this.top == this.size;
    }
    
     public boolean isMinStackEmpty() {
        return this.min_top == -1;
    }
    
    public boolean isMinStackFull() {
        return this.min_top == this.size;
    }
}
