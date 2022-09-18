class MyCircularQueue {

    private int[] arr;
    private int nowSize;
    private int length;
    private int pos;

    public MyCircularQueue(int k) {
        this.arr = new int[k];
        this.nowSize = 0;
        this.length = k;
        this.pos = 0;
    }
    
    public boolean enQueue(int value) {
        if(nowSize == length)
            return false;
        arr[pos++] = value;
        nowSize++;
        return true;
    }
    
    public boolean deQueue() {
        if(nowSize == 0)
            return false;
        for(int i=0; i < length - 1; i++){
            arr[i] = arr[i + 1];
        }
        pos--;
        nowSize--;
        return true;
    }
    
    public int Front() {
        if(nowSize == 0)
            return -1;
        return arr[0];
    }
    
    public int Rear() {
        if(nowSize == 0)
            return -1;
        return arr[pos - 1];
    }
    
    public boolean isEmpty() {
        return nowSize == 0;
    }
    
    public boolean isFull() {
        return nowSize == length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
