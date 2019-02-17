import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int n=s.length();
     int temp=0;
      for(int i=0;i<n;i++)
      {
        temp=0;
        if(s.charAt(i)==s.charAt(n-1))
           {
             temp=1;
          break;
           }
           else
           {
           temp=0;
             break;
           }
           }
      if(temp==1)
      {
      System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}