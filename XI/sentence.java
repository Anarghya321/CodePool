import java.util.*;
public class sentence
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String str,f=" ";
        System.out.println("Enter a sentence");
        str=sc.nextLine();
        str=str.toUpperCase();
        char c=str.charAt(str.length()-1);
        String str1=str.substring(0,str.length()-1);
        if(c=='.'||c=='!'||c=='?')
        {
            System.out.println("Enter the word to be deleted");
            String w=sc.nextLine();
            StringTokenizer s=new StringTokenizer(str1);
            while(s.hasMoreTokens())
            {
                String word=s.nextToken();
                if(w.equalsIgnoreCase(word)==false)
                {
                    f=f+word+" ";
                }
            }
            System.out.println("Final Sentence: "+f.trim()+c);
        }
        else
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}

                