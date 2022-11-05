class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> A=new HashSet<>();
        while(n!=1){
            int curr=n;
            int sum=0;
            while(curr!=0){
                sum+=(curr%10)*(curr%10);
                curr/=10;
            }
            if(A.contains(sum)){
                return false;
            }
            A.add(sum);
            n=sum;
        }
        return true;    
    }
}
