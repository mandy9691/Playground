import java.util.Scanner; 
  public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner s=new Scanner(System.in);
      int a[],n,count=0,count1=0,b[],j=0;
      n=s.nextInt();
      a=new int[n];
      b=new int[n];
      for(int i=0;i<n;i++)
      {
      a[i]=s.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        if(a[i]==1)
        {
          count++;
        }
        else if(a[i]==0)
        { b[j]=count;
        j++;
          count=0;
        }
      }
      count=b[0];
      for(int i=1;i<j;i++)
      {
        if(count<b[i])
        {
          count=b[i];
        }
      }
      
          
      System.out.print(count);
    }
}