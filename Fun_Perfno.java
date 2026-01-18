import java.io.*;
import java.lang.*;
class Fun_Perfno
{
    void per(int n)
    {
        int i,y=0,p=0;
        for(i=1;i<=n;i++)
        {
            if(i%n==0)
            {
                p = p+i;
            }
        }
        if(p==n)
        {
            System.out.println(n+" is a Perfect number");
        }
        else
        {
            System.out.println(n+" is not a Perfect number");
        }
    }
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int a;
            System.out.println("Enter the number:");
            a = Integer.parseInt(ob1.readLine());
            Fun_Perfno loop = new Fun_Perfno();
            loop.per(a);
        }
    }
}