import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int fact,sum=0;
      int temp=n;
      while(n!=0)
      {
        int k=n%10;
         n=n/10;
        fact=1;
        for(int i=1;i<=k;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;

      }
      if(sum==temp)
      System.out.println("Yes");
      else
        System.out.println("No");
	}
}