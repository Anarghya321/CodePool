import java.util.*;
public class day
{
    boolean isleap(int year)
    {
        if(year%4==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void main()
    {
        Scanner sc =new Scanner(System.in);
        day obj=new day();
        int d,year,month=0,date=0,d2,n,m=0,da=0;
        String ar[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Enter day no.");
        d=sc.nextInt();
        System.out.println("Enter year");
        year=sc.nextInt();
        System.out.println("Enter no. of days to be added");
        n=sc.nextInt();
        d2=d+n;
        if(n>100)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        else
        {
            if(obj.isleap(year)==true&&d2>366)
            {
                d2=d2-366;
            }
            else if(obj.isleap(year)==false&&d2>366)
            {
                d2=d2-365;
            }
            if(d>366)
            {
                System.out.println("INVALID INPUT");
                System.exit(0);
            }
            else
            {
                if(obj.isleap(year)==true)
                {
                    for(int i=1;i<=d;i++)
                    {
                        if(i<=31)
                        {
                            month=0;
                            date=i;
                        }
                        if(i>31&&i<=60)
                        {
                            month=1;
                            date=i-31;
                        }
                        if(i>60&&i<=91)
                        {
                            month=2;
                            date=i-60;
                        }
                        if(i>91&&i<=121)
                        {
                            month=3;
                            date=i-91;
                        }
                        if(i>121&&i<=152)
                        {
                            month=4;
                            date=i-121;
                        }
                        if(i>152&&i<=182)
                        {
                            month=5;
                            date=i-152;
                        }
                        if(i>182&&i<=213)
                        {
                            month=6;
                            date=i-182;
                        }
                        if(i>213&&i<=244)
                        {
                            month=7;
                            date=i-213;
                        }
                        if(i>244&&i<=274)
                        {
                            month=8;
                            date=i-244;
                        }
                        if(i>274&&i<=305)
                        {
                            month=9;
                            date=i-274;
                        }
                        if(i>305&&i<=335)
                        {
                            month=10;
                            date=i-305;
                        }
                        if(i>335&&i<=366)
                        {
                            month=11;
                            date=i-335;
                        }
                    }
                    System.out.println("Date: "+date+" Month: "+ar[month]     +" Year: "+year);
                }
                else
                {
                    for(int i=1;i<=d;i++)
                    {
                        if(i<=31)
                        {
                            month=0;
                            date=i;
                        }
                        if(i>31&&i<=59)
                        {
                            month=1;
                            date=i-31;
                        }
                        if(i>59&&i<=90)
                        {
                            month=2;
                            date=i-59;
                        }
                        if(i>90&&i<=120)
                        {
                            month=3;
                            date=i-90;
                        }
                        if(i>120&&i<=151)
                        {
                            month=4;
                            date=i-120;
                        }
                        if(i>151&&i<=181)
                        {
                            month=5;
                            date=i-151;
                        }
                        if(i>181&&i<=212)
                        {
                            month=6;
                            date=i-181;
                        }
                        if(i>212&&i<=243)
                        {
                            month=7;
                            date=i-212;
                        }
                        if(i>243&&i<=273)
                        {
                            month=8;
                            date=i-243;
                        }
                        if(i>273&&i<=304)
                        {
                            month=9;
                            date=i-273;
                        }
                        if(i>304&&i<=334)
                        {
                            month=10;
                            date=i-304;
                        }
                        if(i>334&&i<=365)
                        {
                            month=11;
                            date=i-334;
                        }
                    }
                    System.out.println("Date: "+date+" Month: "+ar[month]     +" Year: "+year);
                }
                if(obj.isleap(year)==true)
                {
                    for(int i=1;i<=d2;i++)
                    {
                        if(i<=31)
                        {
                            m=0;
                            da=i;
                        }
                        if(i>31&&i<=60)
                        {
                            m=1;
                            da=i-31;
                        }
                        if(i>60&&i<=91)
                        {
                            m=2;
                            da=i-60;
                        }
                        if(i>91&&i<=121)
                        {
                            m=3;
                            da=i-91;
                        }
                        if(i>121&&i<=152)
                        {
                            m=4;
                            da=i-121;
                        }
                        if(i>152&&i<=182)
                        {
                            m=5;
                            da=i-152;
                        }
                        if(i>182&&i<=213)
                        {
                            m=6;
                            da=i-182;
                        }
                        if(i>213&&i<=244)
                        {
                            m=7;
                            da=i-213;
                        }
                        if(i>244&&i<=274)
                        {
                            m=8;
                            da=i-244;
                        }
                        if(i>274&&i<=305)
                        {
                            m=9;
                            da=i-274;
                        }
                        if(i>305&&i<=335)
                        {
                            m=10;
                            da=i-305;
                        }
                        if(i>335&&i<=366)
                        {
                            m=11;
                            da=i-335;
                        }
                    }
                    System.out.println("DATE AFTER "+n+" DAYS:-");
                    System.out.println("Date: "+da+" Month: "+ar[m]+" Year: "+year);
                }
                else
                {
                    for(int i=1;i<=d2;i++)
                    {
                        if(i<=31)
                        {
                            m=0;
                            da=i;
                        }
                        if(i>31&&i<=59)
                        {
                            m=1;
                            da=i-31;
                        }
                        if(i>59&&i<=90)
                        {
                            m=2;
                            da=i-59;
                        }
                        if(i>90&&i<=120)
                        {
                            m=3;
                            da=i-90;
                        }
                        if(i>120&&i<=151)
                        {
                            m=4;
                            da=i-120;
                        }
                        if(i>151&&i<=181)
                        {
                            m=5;
                            da=i-151;
                        }
                        if(i>181&&i<=212)
                        {
                            m=6;
                            da=i-181;
                        }
                        if(i>212&&i<=243)
                        {
                            m=7;
                            da=i-212;
                        }
                        if(i>243&&i<=273)
                        {
                            m=8;
                            da=i-243;
                        }
                        if(i>273&&i<=304)
                        {
                            m=9;
                            da=i-273;
                        }
                        if(i>304&&i<=334)
                        {
                            m=10;
                            da=i-304;
                        }
                        if(i>334&&i<=365)
                        {
                            m=11;
                            da=i-334;
                        }
                    }
                    System.out.println("DATE AFTER "+n+" DAYS:-");
                    System.out.println("Date: "+da+" Month: "+ar[m]+" Year: "+year);
                }
            }
        }
    }
}
