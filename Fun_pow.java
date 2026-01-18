import java.io.*;
import java.lang.*;
class Fun_pow
{
    void power(int a, int b)
    {
        int p=1,i;
        for(i=1;i<=b;i++)
        {
            p = p*a;
        }
        System.out.println(a+" power "+b+" is : "+p);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int x,y;
            System.out.println("Enter the number :");
            x = Integer.parseInt(ob1.readLine());
            System.out.println("Enter "+x+" power :");
            y = Integer.parseInt(ob1.readLine());
            Fun_pow Power = new Fun_pow();
            Power.power(x,y);
        }
    }
}