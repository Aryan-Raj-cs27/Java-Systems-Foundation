import java.io.*;
class Word_Flip_2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        String nm;
        int i,j,l,n=0;
        nm = ob1.readLine();
        l = nm.length();
        n = l;
        for(i=(l-1);i>=0;i--)
        {
            if(nm.charAt(i) == ' ' || i == 0)
            {
                if(i==0)
                i--;
                for(j=(i+1);j<n;j++)
                {
                    System.out.print(nm.charAt(j));
                }
                System.out.print(" ");
                n = i;
            }
        }
    }
}