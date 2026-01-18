import java.io.*;
class Word_flip
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String nm;
            int l,i,j,x=0;
            System.out.println("Enter the sentence:");
            nm = (ob1.readLine());
            l = nm.length();
            for(i=0;i<l;i++)
            {
                if(nm.charAt(i)==' ')
                {
                    for(j=i-1;j>=x;j--)
                    {
                        System.out.print(nm.charAt(j));
                    }
                    System.out.print(" ");
                    x=i;
                }
            }
            for(j=l-1;j>=x;j--)
                    {
                        System.out.print(nm.charAt(j));
                    }
        }
    }
}