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
    max(arr,n);
  }
  public static void max(int arr[],int n)
  {
    int temp=0;
    int k=0;
    for(int i=0;i<n;i++)
    {
      for(int j=1;j<n;j++)
      {
        if(arr[i]>arr[j] && temp<arr[i])       
        {
          temp=arr[i];
          k=i;
        }
        }
       }     
    System.out.println(k);
  }
  }
