import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int temp=0;
      for(int i=0;i<n-1;i++)
      {
        if(arr[i]>arr[i+1] && arr[i]>temp)
        {
          temp=arr[i];
        }
        else if(arr[i+1]>temp)
          temp=arr[i+1];
    }
      System.out.println(temp);
}
}