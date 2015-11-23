import java.util.*;
public class toy
{
    double s1,s2,s3,s4,tp1,tp2,tp3,tp4,sp1=0,sp2=0,sp3=0,sp4=0;
    Scanner sc =new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the total sale and total produce of Robot");
        s1=sc.nextDouble();
        tp1=sc.nextDouble();
        System.out.println("Enter the total sale and total produce of Car");
        s2=sc.nextDouble();
        tp2=sc.nextDouble();
        System.out.println("Enter the total sale and total produce of Lego");
        s3=sc.nextDouble();
        tp3=sc.nextDouble();
        System.out.println("Enter the total sale and total produce of doll");
        s4=sc.nextDouble();
        tp4=sc.nextDouble();
    }
    void percentage()
    {
        sp1=(s1/tp1)*100;
        sp2=(s2/tp2)*100;
        sp3=(s3/tp3)*100;
        sp4=(s4/tp4)*100;
        if(sp1>85)
        {
             System.out.println("Rate of sale of robot: very good");
        }
        if((sp1>65)&&(sp1<=85))
        {
             System.out.println("Rate of sale of robot: good");
        }
        if((sp1>40)&&(sp1<=65))
        {
             System.out.println("Rate of sale of robot: average");
        }
        if(sp1<=40)
        {
             System.out.println("Rate of sale of robot: poor");
        }
        if(sp2>85)
        {
             System.out.println("Rate of sale of car: very good");
        }
        if((sp2>65)&&(sp2<=85))
        {
             System.out.println("Rate of sale of car: good");
        }
        if((sp2>40)&&(sp2<=65))
        {
             System.out.println("Rate of sale of car: average");
        }
        if(sp2<=40)
        {
             System.out.println("Rate of sale of car: poor");
        }
        if(sp3>85)
        {
             System.out.println("Rate of sale of lego: very good");
        }
        if((sp3>65)&&(sp3<=85))
        {
             System.out.println("Rate of sale of lego: good");
        }
        if((sp3>40)&&(sp3<=65))
        {
             System.out.println("Rate of sale of lego: average");
        }
        if(sp3<=40)
        {
             System.out.println("Rate of sale of lego: poor");
        }
        if(sp4>85)
        {
             System.out.println("Rate of sale of doll: very good");
        }
        if((sp4>65)&&(sp4<=85))
        {
             System.out.println("Rate of sale of doll: good");
        }
        if((sp4>40)&&(sp4<=65))
        {
             System.out.println("Rate of sale of doll: average");
        }
        if(sp4<=40)
        {
             System.out.println("Rate of sale of doll: poor");
        }
    }
    void main()
    {
        toy obj =new toy();
        obj.input();
        obj.percentage();
    }
}
