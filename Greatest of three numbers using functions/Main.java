import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner  sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      System.out.println(greater(n1,n2,n3));
    }
  public static int greater(int n1,int n2,int n3)
  {
    int n;
    if(n1>n2 && n1>n3)
    {
      n=n1;
    }
    else if(n1>n2 && n1<n3)
    {
      n=n3;
    }
    else
    {
      n=n2;
    }
    return n;
  }
	}
