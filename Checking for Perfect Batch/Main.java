import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    batch(arr,n);
  }
  public static void batch(int arr[],int n)
  {
    int sum=0,sum1=0;   
    for(int i=0;i<n/2;i++)
    {
      sum=sum+arr[i];
    }
    if(n/2==0)
    {
    for(int i=(n/2);i<n;i++)
    {
      sum1=sum1+arr[i];
    }
    }
    else
      for(int i=(n/2)+1;i<n;i++)
      {
        sum1=sum1+arr[i];
      }
  if(sum==sum1)
  {
    System.out.println("Perfect Batch");
  }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
    //Try your code here
}