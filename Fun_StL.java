import java.io.*;
import java.lang.*;
class Fun_StL
{
    void length(String nm)
    {
        int l = nm.length();
        System.out.println("Number of Words in Sentence '"+nm+"' is "+l);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String mn;
            System.out.println("Enter the Sentence:");
            mn = ob1.readLine();
            Fun_StL find = new Fun_StL();
            find.length(mn);
        }
    }
}