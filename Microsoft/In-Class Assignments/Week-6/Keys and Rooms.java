class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        visited[0]=true;
        Stack<Integer> stack=new Stack();
        stack.push(0);
        while(!stack.isEmpty())
        {
            int node=stack.pop();
            for(int key:rooms.get(node))
            {
                if(!visited[key])
                {
                    visited[key]=true;
                    stack.push(key);
                }
            }
        }
        for(boolean v:visited)
        {
            if(!v)
                return false;
        }
        return true;
    }
}
