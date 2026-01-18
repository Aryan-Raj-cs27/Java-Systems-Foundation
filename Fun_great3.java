import java.io.*;
import java.lang.*;
class Fun_great3
{
    void great(int a, int b, int c)
    {
        if(a>b&&a>c)
        {
            System.out.println("The greatest number between "+a+", "+b+" & "+c+" is : "+a);
        }
        else if(b>a&&b>c)
        {
            System.out.println("The greatest number between "+a+", "+b+" & "+c+" is : "+b);
        }
        else if(c>a&&c>b)
        {           
            System.out.println("The greatest number between "+a+", "+b+" & "+c+" is : "+c);
        }
        else
        {
            System.out.println("All the three number are equal ");
        }
    }
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int x,y,z;
            System.out.println("Enter the first number :");
            x = Integer.parseInt(ob1.readLine());
            System.out.println("Enter the second number :");
            y = Integer.parseInt(ob1.readLine());
            System.out.println("Enter the third number :");
            z = Integer.parseInt(ob1.readLine());
            Fun_great3 Great = new Fun_great3();
            Great.great(x,y,z);
        }
    }
}