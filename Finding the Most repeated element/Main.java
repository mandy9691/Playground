
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner s=new Scanner(System.in);
    int n,a[];
    n=s.nextInt();
    a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    int []b=new int[10];
    Arrays.fill(b,0);
    for(int i=0;i<n;i++)
    {
      b[a[i]]++;
    }
    int count=b[0];
    for(int i=1;i<10;i++)
    {
      if(count<b[i])
        count=b[i];

        
    }
    if(count==1)
    {
    System.out.print(a[0]);
    }
    else
         System.out.print(count); 
      
  }
}