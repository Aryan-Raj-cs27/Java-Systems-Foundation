import java.io.*;
import java.lang.*;
class Fun_StVow
{
    void vowels(String nm)
    {
        int i,l = nm.length();
        int a = 0,e = 0,I = 0,o = 0,u = 0;
        for(i=0;i<l;i++) 
        {
            if(nm.charAt(i)=='a'||nm.charAt(i)=='A')
            {
                a++;
            }
            if(nm.charAt(i)=='e'||nm.charAt(i)=='E')
            {
                e++;
            }
            if(nm.charAt(i)=='i'||nm.charAt(i)=='I')
            {
                I++;
            }
            if(nm.charAt(i)=='o'||nm.charAt(i)=='O')
            {
                o++;
            }
            if(nm.charAt(i)=='u'||nm.charAt(i)=='U')
            {
                u++;
            }
        }
        System.out.println("A = "+a);
        System.out.println("E = "+e);
        System.out.println("I = "+I);
        System.out.println("O = "+o);
        System.out.println("U = "+u);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String mn;
            System.out.println("Enter the sentence:");
            mn = ob1.readLine();
            Fun_StVow find = new Fun_StVow();
            find.vowels(mn);
        }
    }
}