import java.util.*;
public class GameHelper
{
    public String getUserInput(String prompt)
    {
        String inputLine= null;
        System.out.println(prompt+ " ");
        try
        {
            Scanner sc = new Scanner(System.in);
            inputLine=sc.next();
            if(inputLine.length()==0)
            return null;
        } catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
        return inputLine;
    }
}
