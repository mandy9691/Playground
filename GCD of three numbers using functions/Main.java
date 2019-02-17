import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      System.out.println(gcd(n1,n2,n3));
    }
  public static int gcd(int n1,int n2,int n3)
  {
    int h,f=1;
    if(n1>n2 && n1>n3)
      h=n1;
    else if(n1>n2 && n1<n3)
      h=n3;
    else
      h=n2;
    for(int i=1;i<=h/2;i++)
    {
      if(n1%i==0 && n2%i==0 && n3%i==0)
        f=i;
    }
    return f;
  }
      
        
	    // Type your code here
	}
