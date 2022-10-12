import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int len=s.length();
    int []frequency=new int[len];
    char str[]=s.toCharArray();
    for(int i=0;i<s.length();i++){
    frequency[i]=1;
      for(int j=i+1;j<s.length();j++){
        if(str[i]==str[j]){
          frequency[i]++;
          str[j]='0';
        }
      }
    }
    for(int i=0;i<frequency.length;i++){
      if(str[i]!=' ' && str[i]!='0'){
        System.out.println(str[i]+""+frequency[i]);
      }
    }
  }
}
