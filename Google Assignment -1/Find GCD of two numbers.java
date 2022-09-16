import java.util.*;

class Main{
  public static int GCD(int A,int B){
    return (A==0)?B:GCD(B%A,A);
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    System.out.println(GCD(A,B));
  
  }
}
