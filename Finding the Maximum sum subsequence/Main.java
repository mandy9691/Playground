import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
      int size=s.nextInt();
     int a[];
       a=new int[size];
    
    for(int i=0;i<size;i++)
    {
      a[i]=s.nextInt();
      
      }
     int sum=a[0];
for(int i=1;i<size;i++)
{
  if(a[i]>a[i-1])
      {
        sum=sum+a[i];
      }
  else
    sum=a[i];
  
}
    
    System.out.print(sum);
    }
    }
    
  
