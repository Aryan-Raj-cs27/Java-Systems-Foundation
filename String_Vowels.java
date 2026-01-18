import java.util.*;
class String_Vowels
{
    public static void main(String args[])
    {
        String nm;
        int j,l,a=0,e=0,i=0,o=0,u=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        nm = sc.next();
        l = nm.length();
        for(j=0;j<l;j++)
        {
            if(nm.charAt(j)=='a')
            {
                a++;
            }
            else if(nm.charAt(j)=='e')
            {
                e++;
            }
            else if(nm.charAt(j)=='i')
            {
                i++;
            }
            else if(nm.charAt(j)=='o')
            {
                o++;
            }
            else if(nm.charAt(j)=='u')
            {
                u++;
            }
        }
        System.out.println("a = "+a);
        System.out.println("e = "+e);
        System.out.println("i = "+i);
        System.out.println("o = "+o);
        System.out.println("u = "+u);
    }
}