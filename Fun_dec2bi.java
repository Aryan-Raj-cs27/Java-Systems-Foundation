import java.io.*;
import java.lang.*;
class Fun_dec2bi
{
    void bi(int n)
    {
        int i,f,b=0,x=1;
        for(i=1;n>0;i++)
        {
            f = n%2;
            b = b+f*x;
            x = x*10;
            n = n/2;
        }
        System.out.println(b);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int a;
            System.out.println("Enter the number:");
            a = Integer.parseInt(ob1.readLine());
            Fun_dec2bi dec = new Fun_dec2bi();
            dec.bi(a);
        }
    }
}