import java.io.*;
import java.lang.*;
class Fun_sub
{
    void subtract(int a, int b)
    {
        int c =a-b;
        System.out.println("Subtraction of given number is : "+c);
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
            Fun_sub sub = new Fun_sub();
            sub.subtract(x,y);
        }
    }
}