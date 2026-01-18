import java.io.*;
import java.lang.*;
class Fun_Special
{
    void special(int n)
    {
        int m =n;
        int i,j,x,f,sp=0;
        for(i=1;n>0;i++)
        {
            f =1;
            x = n%10;
            for(j=1;j<=x;j++)
            {
                f = f*j;
            }
            sp = sp+f;
            n = n/10;
        }
        if(sp==m)
        {
            System.out.println(m+" is a Special number");
        }
        else
        {
            System.out.println(m+" is not a Special number");
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
            Fun_Special loop = new Fun_Special();
            loop.special(a);
        }
    }
}