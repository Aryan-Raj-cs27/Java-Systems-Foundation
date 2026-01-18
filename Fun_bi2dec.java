import java.io.*;
import java.lang.*;
class Fun_bi2dec
{
    void dec(int n)
    {
        int i,j,p=1,x,b=0;
        for(i=1;n>0;i++)
        {
            for(j=1;j<i;j++)
            {
                p = p*2;
            }
            x = n%10;
            b = (b+(x*p));
            n = n/10;
            p = 1;
        }
        System.out.println(b);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int a;
            System.out.println("Enter the number");
            a = Integer.parseInt(ob1.readLine());
            Fun_bi2dec bi = new Fun_bi2dec();
            bi.dec(a);
        }
    }
}