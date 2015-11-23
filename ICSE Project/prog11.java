import java.util.*;
public class prog11
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double bs;
        double sa=0,gs=0,da=0;
        System.out.println("Enter the basic salaray");
        bs=sc.nextDouble();
        if(bs<=10000)
        {
            da=0.1*bs;
            sa=0.05*bs;
            gs=bs+da+sa;
        }
        if((bs>10000)&&(bs<=20000))
        {
            da=0.12*bs;
            sa=0.08*bs;
            gs=bs+da+sa;
        }
        if((bs>20000)&&(bs<=30000))
        {
            da=0.15*bs;
            sa=0.1*bs;
            gs=bs+da+sa;
        }
        if(bs>30000)
        {
            da=0.2*bs;
            sa=0.1*bs;
            gs=bs+da+sa;
        }
        System.out.println("Basic \t  DA \t  SA  \t  GS");
        System.out.println(bs+ "\t" +da+ "\t" +sa+ "\t" + gs);
    }
}
    