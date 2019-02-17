import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=0,k=1;
      int arr[]=new int[n];
       int arr1[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
     for(int j=0;j<n;j++)
     {
       arr1[j]=j+1;
      
     }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(arr1[i]==arr[j])
          {
            arr1[i]=0;
           
          }
        }
      }
      for(int j=0;j<n;j++)
      {
        if(arr1[j]!=0)
        {
          System.out.println(arr1[j]);
        }
      }
    }
}
      