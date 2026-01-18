import java.io.*;
import java.lang.*;
class Fun_Multi
{
    void Multi(int a,int b)
    {
        int c;
        c = a*b;
        System.out.println("Multiplication of both no = "+c);
    }
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int x,y;
            System.out.println("Enter the firs number :");
            x = Integer.parseInt(ob1.readLine());
            System.out.println("Enter the second number :");
            y = Integer.parseInt(ob1.readLine());
            Fun_Multi Multi = new Fun_Multi();
            Multi.Multi(x,y);
        }
    }
}