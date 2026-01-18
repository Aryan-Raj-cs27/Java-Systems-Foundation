import java.io.*;
class W_F_Flip
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String nm;
            int l,i,j,x=0;
            System.out.println("Enter the sentence:");
            nm = ob1.readLine();
            l = nm.length();
            for(i=l-1;i>=0;i--)
            {
                System.out.print(nm.charAt(i));
            }
        }
    }
}