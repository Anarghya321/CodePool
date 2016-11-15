import java.util.*;
import java.io.*;
public class employees
{
    void writeRecord(String name,int empcode,double sal)throws IOException
    {
        FileOutputStream fout=new FileOutputStream("emp.txt",true);
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            fout.write(ch);
        }
        fout.write(' ');
        for(int i=0;i<Integer.toString(empcode).length();i++)
        {
            char ch1=Integer.toString(empcode).charAt(i);
            fout.write(ch1);
        }
        fout.write(' ');
        for(int i=0;i<Double.toString(sal).length();i++)
        {
            char ch2=Double.toString(sal).charAt(i);
            fout.write(ch2);
        }
        char l='\n';
        char cr='\r';
        fout.write(cr);
        fout.write(l);
        fout.close();
    }
    void readRecord()throws IOException,FileNotFoundException
    {
        FileInputStream fin=new FileInputStream("emp.txt");
        int c;
        String filedat="";
        while(true)
        {
            c=fin.read();
            if(c==-1)
                break;
            filedat=filedat+(char)c;
        }
        String records[]=filedat.split("\r\n");
        
        System.out.println("Name"+"\t\t"+"Code"+"\t\t"+"Basic Salary"+"\t\t"+"DA"+"\t\t"+"HRA"+"\t\t"+"Salary"+"\t\t"+"Sp. Allowance"+"\t\t"+"Total");
        for(int i=0;i<records.length;i++)
        {
            String data[]=records[i].split(" ");
            String name=data[0];
            int e=Integer.parseInt(data[1]);
            double s=Double.parseDouble(data[2]);
            calculate(name,e,s);
        }
    }
    void calculate(String name,int e,double s)
    {
        double da=0.4*s;
        double hra=0.3*s;
        double gross=s+da+hra;
        double sa;
        if(e<=15&&gross<=1500)
        {
            sa=0.2*gross;
        }
        else
        {
            sa=1000;
        }
        double ta=gross+sa;
        System.out.println(name+"\t\t"+e+"\t\t"+s+"\t\t"+da+"\t\t"+hra+"\t\t"+gross+"\t\t"+sa+"\t\t"+ta);
    }
}

        
        
