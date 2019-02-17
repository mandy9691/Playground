import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int n1=sc.nextInt();
      pairs(n,arr,n1);
    }
  public static void pairs(int n,int arr[],int n1)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(n1==arr[i]+arr[j])
        {
          System.out.println(arr[i]+", "+arr[j]);
        }
              
    }
    }
  }
}