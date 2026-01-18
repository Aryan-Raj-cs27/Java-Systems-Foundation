import java.io.*;
import java.lang.*;
class Fun_Armstrong
{
    void armstrong(int n)
    {
        int i,x,p,a=0;
        int m = n;
        for(i=1;m>0;i++)
        {
            x = m%10;
            p = (x*x*x);
            a = a+p;
            m = m/10;
        }
        if(a==n)
        {
            System.out.println(n+" is an Armstrong number ");
        }
        else
        {
            System.out.println(n+" is not an Armstrong number ");
        }
    }
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int b;
            System.out.println("Enter the number:");
            b = Integer.parseInt(ob1.readLine());
            Fun_Armstrong Arm = new Fun_Armstrong();
            Arm.armstrong(b);
        }
    }
}