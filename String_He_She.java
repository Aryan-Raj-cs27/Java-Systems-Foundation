import java.io.*;
class String_He_She
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String nm;
            int i,l,he=0,she=0;
            System.out.println("Enter String :");
            nm = ob1.readLine();
            l = nm.length();
            for(i=0;i<l;i++)
            {
                if(nm.charAt(i)=='h'||nm.charAt(i)=='H')
                {
                    if(i+1<l)
                    {
                        if(nm.charAt(i+1)=='e'||nm.charAt(i+1)=='E')
                        {
                            if(i-1>0)
                            {
                                if(nm.charAt(i-1)=='s'||nm.charAt(i-1)=='S')
                                {
                                    she++;
                                }
                                else
                                {
                                    he++;
                                }
                            }
                            else
                            {
                                he++;
                            }
                        }
                    }
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("He = "+he);
            System.out.println("She = "+she);
        }
    }
}