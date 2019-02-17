import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int marks[]=new int[n];
      for(int i=0;i<n;i++)
      {
        marks[i]=sc.nextInt();
      }
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int flag=-1,flag1=-1;
      for(int i=0;i<n;i++)
      {
        if(n1==marks[i])
        {
         flag=i;
        }
      }
        for(int i=0;i<n;i++)
        {
         if(n2==marks[i])
        {
          flag1=i;
        }
      }
      System.out.println(flag);
      System.out.println(flag1);
      
        
      }
}