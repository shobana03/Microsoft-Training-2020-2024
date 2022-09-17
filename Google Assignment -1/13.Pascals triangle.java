import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int arr[][]=new int[N][N];
    for(int i=0;i<N;i++){
      for(int j=0;j<=i;j++){
        if(j==0||i==j){
          arr[i][j]=1;
        }else{
          arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
        }
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}
