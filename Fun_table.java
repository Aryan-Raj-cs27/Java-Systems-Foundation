import java.io.*;
import java.lang.*;
class Fun_table
{
    void table(int a)
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(a+" X "+i+" = "+a*i);
        }
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int x;
            System.out.println("Enter the number for table:");
            x = Integer.parseInt(ob1.readLine());
            Fun_table Table = new Fun_table();
            Table.table(x);
        }
    }
}