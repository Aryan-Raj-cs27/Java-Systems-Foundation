import java.util.*;
class Pallindrome
{
    public static void main(String args[])
    {
        String nm;
        int i,l,n=0,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        nm = sc.next();
        l = nm.length();
        for(i=l-1;i>=0;i--)
        {
            if(nm.charAt(i)==nm.charAt(j))
            {
                n++;
            }
            j++;
        }
        if(n==l)
        {
                System.out.println(nm+" is pallindome");
        }
        else
        {
                System.out.println(nm+" is not pallindome");
        }
    }
}