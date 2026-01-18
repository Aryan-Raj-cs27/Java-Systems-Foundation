import java.io.*;
import java.lang.*;
class Fun_StRev
{
    void rev(String nm)
    {
        int i,l = nm.length();
        for(i=l-1;i>=0;i--)
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
            System.out.println("Enter the Sentence");
            mn = ob1.readLine();
            Fun_StRev sent = new Fun_StRev();
            sent.rev(mn);
        }
    }
}