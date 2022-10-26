import java.util.ArrayDeque;
class MyCircularDeque {
     ArrayDeque<Integer> arrDeque;
     int arrSize=0;

    public MyCircularDeque(int k) {
        arrDeque=new ArrayDeque<Integer>(k);
        arrSize=k;
    }
    
    public boolean insertFront(int value) {
        if(!isFull()){
            arrDeque.addFirst(value);
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(!isFull()){
            arrDeque.addLast(value);
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(!isEmpty()){
            arrDeque.removeFirst();
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(!isEmpty()){
            arrDeque.removeLast();
            return true;
        }
        return false;
    }
    
    public int getFront() {
        return !isEmpty()?arrDeque.peekFirst():-1;
    }
    
    public int getRear() {
        return !isEmpty()?arrDeque.peekLast():-1;
        
    }
    
    public boolean isEmpty() {
        return arrDeque.size()==0;
    }
    
    public boolean isFull() {
        return arrDeque.size()==arrSize;
    }
}
