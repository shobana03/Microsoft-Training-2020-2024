import java.util.*;
class Main {
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    for(int i=1;i<=N;i++){
      if(N==i*i){
        System.out.println("It is an Perfect Square");
        return;
      }
    }
    System.out.println("It is not Perfect Square");
    return;
  }
}
