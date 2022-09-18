class Solution {
public int countStudents(int[] students, int[] sandwiches) {

    int j=0;
    
    Queue<Integer> q=new LinkedList<>();
    for(int num:students)
    {
        q.add(num);
    }
    
    int count=0;
    
    while(!q.isEmpty())
    {
        if(q.peek()==sandwiches[j])
        {
            q.remove();
            j++;
            count=0;
        }
        else
        {
            int temp=q.remove();
            q.add(temp);
            count++;
        }
        
        if(count==q.size())
            break;
    }
    
    return q.size();
    
}
}
