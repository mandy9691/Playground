import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(i==n || j==n ||i==m || j==m)
          {
            System.out.print("*");
          }
          else
            System.out.print(" ");
          }
        
      System.out.println();
      }
	}
}