import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String reverse="";
    String str=sc.nextLine();
    for(int i=str.length()-1;i>=0;i--){
      reverse=reverse+str.charAt(i);
    }
      if(str.equals(reverse)){
        System.out.println("Given String is palindrome");
      }else{
      System.out.println("Given String is not palindrome");
    }
  }
}
