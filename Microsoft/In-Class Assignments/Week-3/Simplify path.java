class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack();
        boolean period = false;
        
        String[] s = path.split("/");
        
        for(String str : s){
            
            if(str.equals(".") || str.equals("") || str.equals(" "))continue;
            
            else if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push("/" + str);
            }
        }
        String ans = "";
        while(!st.isEmpty()){
            
            ans = st.pop() + ans;
        }
       
        if(ans.equals(""))return "/";
        return ans;
        
        
    }
}
