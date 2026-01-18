import java.util.*;
class String_rev
{
    public static void main(String args[])
    {
        String nm;
        int l,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        nm = sc.next();
        l = nm.length();
        for(i=l-1;i>=0;i--)
        {
            System.out.print(nm.charAt(i));
        }
    }
}