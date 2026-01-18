import java.io.*;
class Word_Count
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String nm;
            int l,i,w=1;
            System.out.println("Enter Sentence:");
            nm = (ob1.readLine());
            l = nm.length();
            for(i=0;i<l;i++)
            {
                if(nm.charAt(i)==' ')
                {
                    w++;
                }
            }
            System.out.println("No of words :"+w);
        }
    }
}