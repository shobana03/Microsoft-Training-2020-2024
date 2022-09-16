import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    for(int i=N;i>0;i--){
      for(int j=i;j>0;j--){
      System.out.print(j);
      }
      System.out.print("\n");
    }
  }
}
/* 54321
   4321
   321
   21
   1*/
