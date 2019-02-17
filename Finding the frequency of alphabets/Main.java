import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int l = sb.length();
        int freq[] = new int[70]; 
        for(int i = 0; i < 70; i++){
            freq[i] = 0;
        }
        for(int i = 0; i < l; i++)
        {
            if(sb.charAt(i) >= 65 && sb.charAt(i) <= 90)
            {
                int n = sb.charAt(i) - 65;
                char ch = (char)(97 + n);
                sb.setCharAt(i, ch);
            }
            if(sb.charAt(i) >= 97 && sb.charAt(i) <= 122)
            {
                freq[sb.charAt(i) - 97]++;
            }  
        }
        for(int i = 0; i < l; i++)
        {
            if(freq[sb.charAt(i) -97] != 0)
            {
                System.out.print(sb.charAt(i) +"" +freq[sb.charAt(i)-97] + " ");
                freq[sb.charAt(i) -97] = 0;
            }
        }
    }
}

