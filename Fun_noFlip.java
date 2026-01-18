import java.io.*;
import java.lang.*;
class Fun_noFlip
{
    void flip(int n)
    {
        int i,y=0,x;
        for(i=1;n>0;i++)
        {
            y = y*10;
            x = n%10;
            y = (y+x);
            n = n/10;
        }
        System.out.println(y);
    }
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int a;
            System.out.println("Enter the number:");
            a = Integer.parseInt(ob1.readLine());
            Fun_noFlip loop = new Fun_noFlip();
            loop.flip(a);
        }
    }
}