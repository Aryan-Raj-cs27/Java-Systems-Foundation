import java.io.*;
import java.lang.*;
class Fun_nShort
{
    void ns(String nm)
    {
        int i,y=0,x=0,j;
        int l =nm.length();
        for(i=0;i<l;i++)
        {
            if(nm.charAt(i)==' ')
            {
                System.out.print(nm.charAt(x)+". ");
                x = i+1;
                y=i;
            }
        }
        for(i=y+1;i<l;i++)
            {
                System.out.print(nm.charAt(i));
            }
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String mn;
            System.out.println("Enter the name:");
            mn = (ob1.readLine());
            Fun_nShort ns = new Fun_nShort();
            ns.ns(mn);
        }
    }
}