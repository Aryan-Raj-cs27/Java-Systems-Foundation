import java.io.*;
import java.lang.*;
class Fun_Like_Unlike
{
    void like(String nm,String mn)
    {
        int i,L1,L2,n=0;
        L1 = nm.length();
        L2 = mn.length();
        if(L1==L2)
        {
            for(i=0;i<L1;i++)
            {
                if(nm.charAt(i)==mn.charAt(i))
                {
                    n++;
                }
            }
            if(n==L1)
            {
                System.out.println(nm+" is Like String:");
            }
            else
            {
                System.out.println("' "+nm+" ' and ' "+mn+" ' is Unlike String");
            }
        }
        else
        {
            System.out.println("' "+nm+" ' and ' "+mn+" ' is Unlike String");
        }
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String n,m;
            System.out.println("Enter first String:");
            n = ob1.readLine();
            System.out.println("Enter the second String:");
            m = ob1.readLine();
            Fun_Like_Unlike find = new Fun_Like_Unlike();
            find.like(n,m);
            
        }
    }
}