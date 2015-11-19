import java.util.*;
public class guess_game
{
    void pattern1()
    {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
    void pattern2()
    {
        System.out.println("*****");
        System.out.println("*");
        System.out.println("****");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
    }
    public static void main(String args[])
    {
        String ans,ans1;
        char c,c1;
        guess_game obj =new guess_game();
        Scanner sc =new Scanner(System.in);
        System.out.println("Welome to the indentification game");
        System.out.println("Ready to play?");
        c=sc.next().charAt(0);
        if(c=='y')
        {
            System.out.println("Question 1");
            obj.pattern1();
        }
        else
        {
            System.exit(0);
        }
        ans=sc.next();
        if(ans.equalsIgnoreCase("random"))
        {
            System.out.println("Very good");
        }
        else
        {
            System.out.println("Wrong answer");
            System.exit(0); 
        }
        System.out.println("ready fr the next question?");
        c1=sc.next().charAt(0);
        if(c1=='y')
        {
            System.out.println("Question 2");
            obj.pattern2();
        }
        else
        {
            System.out.println("Thank you for playing you answered one question then chickend out");
            System.exit(0);
        }
        ans1=sc.next();
        if(ans1.equalsIgnoreCase("F"))
        {
            System.out.println("Right answer, YOU WON THE GAME");
        }
        else
        {
            System.out.println("Sorry you lost");
            System.exit(0);
        }
    }
}

            
        