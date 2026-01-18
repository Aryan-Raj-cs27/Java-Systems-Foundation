import java.io.*;
import java.lang.*;
class Fun_factorial
{
    void factorial(int a)
    {
        int i,f=1;
        for(i=1;i<=a;i++)
        {
            f = f*i;
        }
        System.out.println("Factorial of "+a+" is : "+f);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int x;
            System.out.println("Enter he number for Factorial: ");
            x = Integer.parseInt(ob1.readLine());
            Fun_factorial Factorial = new Fun_factorial();
            Factorial.factorial(x);
        }
    }
}