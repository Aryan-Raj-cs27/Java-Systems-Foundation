import java.io.*;
import java.lang.*;
class Fun_the
{
    void the(String nm)
    {
        int i,j,l = nm.length();
        for(i=0;i<l;i++)
        {
            if(nm.charAt(i)=='t'||nm.charAt(i)=='T')
            {
                if(i+3<l)
                {
                    if(nm.charAt(i+1)=='h'||nm.charAt(i+1)=='H')
                    {
                        if(nm.charAt(i+2)=='e'||nm.charAt(i+2)=='E')
                        {
                            if(nm.charAt(i+3)==' ')
                            {
                                for(j=0;j<3;j++)
                                {
                                    System.out.print(" ");
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
            System.out.print(nm.charAt(i));
        }
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String mn;
            System.out.println("Enter the Sentence:");
            mn = ob1.readLine();
            Fun_the remove = new Fun_the();
            remove.the(mn);
        }
    }
}