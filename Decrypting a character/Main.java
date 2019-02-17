import java.util.Scanner;
public class Main{
    public static void main(String args[]) 
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int n=sc.nextInt();
      int v=0;
      if(ch>=97)
      {
        v=ch-97;
         ch=(char) (122+v-n+1);        
      }
      int q=0;
      if(ch>=65 && ch<97)
      {
        ch=(char) (ch-n);
        //ch=(char) (90-q-n+1);
      }
      System.out.print(ch);
    }
}