import java.io.*;
class Name_short
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String nm;
            int i,j,l,x,y=0;
            System.out.println("Enter the name:");
            nm = (ob1.readLine());
            l = nm.length();
            for(i=0;i<l;i++)
            {
                if(nm.charAt(i)==' ')
                {
                    x = i;
                    for(j=x;j>=0;j--)
                    {
                        if(j==y)
                        {
                            System.out.print(nm.charAt(j)+". ");
                        }
                    }
                    y = x+1;
                }
            }
            for(j=y;j<l;j++)
            {
                System.out.print(nm.charAt(j));
            }
        }
    }
}