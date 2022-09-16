import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    for(int i=0;i<N;i++){
      int ctr=1;
      for(int j=0;j<=i;j++){
      System.out.print(ctr);
        ctr++;
      }
      System.out.print("\n");
    }
  }
}
