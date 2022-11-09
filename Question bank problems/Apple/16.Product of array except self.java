class Solution {
    public int[] productExceptSelf(int[] nums) {
        int S=nums.length;
        int start[]=new int[S];
        int end[]=new int[S];
        start[0]=1;
        for(int i=1;i<S;i++){
            start[i]=start[i-1]*nums[i-1];
        }
        end[S-1]=1;
        for(int i=S-2;i>-1;i--){
            end[i]=end[i+1]*nums[i+1];
        }
        int[] result=new int[S];
        for(int i=0;i<S;i++){
            result[i]=start[i]*end[i];
        }
        return result;
        
    }
}
