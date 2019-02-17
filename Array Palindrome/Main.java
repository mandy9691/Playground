import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int count=0;
    //  int i=0;
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int i=0;
      {
      if((arr[i]==arr[n-i-1]) && arr[i+1]==arr[n-i-2])
      {
       count++;
      }
      i++;
      }
      if(count==1)
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
      }
    
    }












