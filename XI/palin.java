import java.util.*;
public class palin
{
    public static void main(String args[])
    {
        int c=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a sentence");
        StringTokenizer s=new StringTokenizer(sc.nextLine());
        while(s.hasMoreTokens())
        {
            StringBuffer w=new StringBuffer(s.nextToken());
            String words=w.toString();
            StringBuffer r=new StringBuffer(w.reverse());
            if(words.contentEquals(r)==true)
            {
                System.out.println("Palindrome word: "+words);
                c++;
            }
        }
        System.out.println("No. of palindrome words: "+c);
    }
}
