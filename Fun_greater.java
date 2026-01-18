import java.io.*;
import java.lang.*;
class Fun_greater
{
    void great(int a, int b)
    {
        if(a>b)
        {
            System.out.println("The greatest number between "+a+" & "+b+" is : "+a);
        }
        else if(b>a)
        {
            System.out.println("The greatest number between "+a+" & "+b+" is : "+b);
        }
        else
        {
            System.out.println("Both number is equal ");
        }
    }
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int x,y;
            System.out.println("Enter the first number :");
            x = Integer.parseInt(ob1.readLine());
            System.out.println("Enter the second number :");
            y = Integer.parseInt(ob1.readLine());
            Fun_greater Great = new Fun_greater();
            Great.great(x,y);
        }
    }
}