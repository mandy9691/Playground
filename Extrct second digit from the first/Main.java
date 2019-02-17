import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l=0,m=0;
    int temp;
    temp=n;
    while(n!=0)
    {
      l=n%10;
      n=n/10;
    }
    while(temp!=l)
    {
      m=temp%10;
      temp=temp/10;

    }
    System.out.println(m);
  }}