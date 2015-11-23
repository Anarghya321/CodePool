import java.util.*;
public class prog9
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int s,n;
        double r,l,b,h;
        double v,v1,v2=0;
        System.out.println("Enter 1 for volume of a cube, 2 for volume of a sphere and 3 for volume of a cuboid");
        n=sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("Enter the side of a cube(in meter)");
            s=sc.nextInt();
            v=s*s*s;
            System.out.println("The volume of the cube: "+v+" cubic meter");
            break;
            case 2:
            System.out.println("Enter the radius of a sphere(in meter)");
            r=sc.nextDouble();
            v1=1.33*3.14*r*r*r;
            System.out.println("The volume of a sphere: "+v1+" cubic meter");
            break;
            case 3:
            System.out.println("Enter the length, breadth and height of the cuboid(int meter)");
            l=sc.nextDouble();
            b=sc.nextDouble();
            h=sc.nextDouble();
            v2=l*b*h;
            System.out.println("The volume of a cuboid: "+v2+" cubic meter");
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
}

       
        
            
        
            