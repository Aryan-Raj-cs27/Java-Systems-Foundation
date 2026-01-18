import java.io.*;
import java.lang.*;
class Fun_HCF
{
    void hcf(int a,int b)
    {
        int i,h=1;
        for(i=1;i<b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                h = i;
            }
        }
        System.out.println("Highest coman factor of "+a+" and "+b+" is "+h);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int n,m;
            System.out.println("Enter the first number:");
            n = Integer.parseInt(ob1.readLine());
            System.out.println("Enter the second number:");
            m = Integer.parseInt(ob1.readLine());
            Fun_HCF find = new Fun_HCF();
            find.hcf(n,m);
        }
    }
}