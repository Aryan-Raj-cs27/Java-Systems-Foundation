import java.io.*;
import java.lang.*;
class Fun_StNext
{
    void line(String nm)
    {
        int i,l = nm.length();
        for(i=0;i<l;i++)
        {
            System.out.println(nm.charAt(i));
        }
    }
    public static void mian(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String mn;
            System.out.println("Enter the name:");
            mn = ob1.readLine();
            Fun_StNext next = new Fun_StNext();
            next.line(mn);
            
        }
    }
}