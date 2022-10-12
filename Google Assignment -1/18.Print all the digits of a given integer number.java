import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int arr[]=new int[100];
    int i=0;
    while(N!=0){
      int x= N%10;
      arr[i]=x;
      i++;
      N=N/10;
    }
    for(int j=i-1;j>=0;j--){
      System.out.println(arr[j]);
    }
  }
}
