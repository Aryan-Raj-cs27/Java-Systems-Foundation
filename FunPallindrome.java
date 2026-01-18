import java.io.*;
import java.lang.*;
class FunPallindrome
{
    void Pallindrome(String nm)
    {
        int i,n=0,j=0,l = nm.length();
        for(i=l-1;i>=0;i--)
        {
            if(nm.charAt(i)==nm.charAt(j))
            {
                n++;
            }
            j++;
        }
        if(n==j)
        {
            System.out.println(nm+" is Pallindrome");
        }
        else
        {
            System.out.println(nm+" is not Pallindrome");
        }
    }
    public static void main(String aegs[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            String mn;
            System.out.println("Enter the Name");
            mn = ob1.readLine();
            FunPallindrome find = new FunPallindrome();
            find.Pallindrome(mn);
        }
    }
}