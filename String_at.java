import java.util.*;
class String_at
{
    public static void main(String args[])
    {
        String nm;
        int l,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        nm = sc.next();
        l = nm.length();
        for(i=0;i<l;i++)
        {
            System.out.println(nm.charAt(i));
        }
    }
}