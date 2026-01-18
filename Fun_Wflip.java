import java.io.*;
import java.lang.*;
class Fun_Wflip
{
    void flip(String nm)
    {
        int l = nm.length();
        int i,n,m=0,j,x;
        for(i=0;i<=l;i++)
        {
            if(i==l)
            {
                for(i=l-1;i>=m;i--)
                {
                    System.out.print(nm.charAt(i));
                }
                break;
            }
            if(nm.charAt(i)==' ')
            {
                for(j=i-1;j>=m;j--)
                {
                    System.out.print(nm.charAt(j));
                }
                m = i+1;
                System.out.print(" ");
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String mn;
            System.out.println("Enter the Strng:");
            mn = ob1.readLine();
            Fun_Wflip word = new Fun_Wflip();
            word.flip(mn);
        }
    }
}