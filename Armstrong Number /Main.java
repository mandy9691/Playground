import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m,k,count=0,mul=1,sum=0;
      int temp=n;
      int temp1=n;
      while(n!=0)
      {
        m=n%10;
        count++;
        n=n/10;
      }  
      while(temp!=0)
      {
         k=temp%10;
        temp=temp/10;
        mul=1;
      for(int i=1;i<=count;i++)
      {
        mul=mul*k;
      }
       
       sum=sum+mul;
    }if(sum==temp1)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
}
}