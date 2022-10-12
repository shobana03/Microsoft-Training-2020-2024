class Solution {
    public int climbStairs(int n) {
       int Fib[]=new int[n+4];
    Fib[0]=0;
    Fib[1]=1;
    Fib[2]=2;
    for(int i=3;i<=n;i++){
        Fib[i]=Fib[i-1]+Fib[i-2]   ;
    }
    return Fib[n];
}
}
