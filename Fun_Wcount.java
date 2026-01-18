import java.io.*;
import java.lang.*;
class Fun_Wcount
{
    void word(String nm)
    {
        int l;
        l = nm.length();
        int i,n = 1;
        for(i=0;i<l;i++)
        {
            if(nm.charAt(i)==' ')
            {
                n++;
            }
        }
        System.out.println("Number of words in ' "+nm+" ' is "+n);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String mn;
            System.out.println("Enter the String:");
            mn = ob1.readLine();
            Fun_Wcount count = new Fun_Wcount();
            count.word(mn);
        }
    }
}