import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    float S=(A+B+C)/2;
    System.out.println(Math.sqrt(S*(S-A)*(S-B)*(S-C)));
  }
}
