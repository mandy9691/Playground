import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    int n=s1.length();
    String s2=sc.nextLine();
    int n1=s2.length();
    int count=0;
    for(int i=0;i<=n-n1;i++)
    {
      String s3=s1.substring(i,i+n1);
     // System.out.println(s3);
      if(s2.equals(s3))
      {
     //  System.out.println(s3);
        count++;
      }
    }
    System.out.println(count);
    
  } 
}