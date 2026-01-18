import java.io.*;
import java.lang.*;
class Fun_Divide
{
    void divide(int x,int y)
    {
        int z;
        z = x/y;
        System.out.println("Divide of Two number is : "+z);
    }
    public static void main(String arghs[])throws IOException
    {
        InputStreamReader ob =new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int a,b;
            System.out.println("Enter the first number :");
            a = Integer.parseInt(ob1.readLine());
            System.out.println("Enter the Second number :");
            b = Integer.parseInt(ob1.readLine());
            Fun_Divide divide = new Fun_Divide();
            divide.divide(a,b);
        }
    }
}