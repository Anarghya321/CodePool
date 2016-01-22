import java.util.*;
public class potential
{
    int potential(String s)
    {
        s=s.toUpperCase();
        int l=s.length();
        int sum=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            sum=sum+(int)ch-64;
        }
        return sum;
    }
    public static void main(String args[])
    {
        potential obj=new potential();
        Scanner sc =new Scanner(System.in);
        String str;
        System.out.println("Enter a sentence");
        str=sc.nextLine();
        int l=str.length();
        char last=str.charAt(l-1);
        if(last=='.'||last=='?'||last=='!')
        {
            str=str.substring(0,l-1);
            StringTokenizer s=new StringTokenizer(str);
            int c=s.countTokens();
            String word[]=new String[c];
            int potential[]=new int[c];
            int i=0,p,j=0,t1=0;
            String t2="";
            while(s.hasMoreTokens())
            word[i++]=s.nextToken();
            for(i=0;i<word.length;i++)
            {
                p=obj.potential(word[i]);
                potential[j++]=p;
            }
            for(i=0;i<word.length;i++)
            {
                System.out.println(word[i]+": "+potential[i]);
            }
            for(i=0;i<word.length-1;i++)
            {
                for(j=i+1;j<word.length;j++)
                {
                    if(potential[i]>potential[j])
                    {
                        t1=potential[i];
                        potential[i]=potential[j];
                        potential[j]=t1;
                        t2=word[i];
                        word[i]=word[j];
                        word[j]=t2;
                    }
                }
            }
            System.out.println("The sentence in increasing potential: ");
            for(i=0;i<word.length;i++)
            {
                System.out.print(word[i]+" ");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}

                
            
            
            