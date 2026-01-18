import java.io.*;
import java.lang.*;
class Fun_Piglatin
{
    void piglatin(String nm)
    {
        int i,n,j,l = nm.length();
        for(i=0;i<l;i++)
        {
            if(nm.charAt(i)=='a'||nm.charAt(i)=='e'||nm.charAt(i)=='i'||nm.charAt(i)=='o'||nm.charAt(i)=='u'||nm.charAt(i)=='A'||nm.charAt(i)=='E'||nm.charAt(i)=='I'||nm.charAt(i)=='O'||nm.charAt(i)=='U')
            {
                for(j=i;j<l;j++)
                {
                    System.out.print(nm.charAt(j));
                }
                for(j=i-1;j>=0;j--)
                {
                    System.out.print(nm.charAt(j));
                }
                System.out.print("ay");
                break;
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String mn;
            System.out.println("Enter the String:");
            mn = ob1.readLine();
            Fun_Piglatin find = new Fun_Piglatin();
            find.piglatin(mn);
        }
    }
}