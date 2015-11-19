public class pattern
{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(int dig=1;dig<=2*i-1;dig++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

                