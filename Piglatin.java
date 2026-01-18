import java.util.*;
class Piglatin
{
    public static void main(String args[])
    {
        String nm;
        int i,j,l,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        nm = sc.next();
        l = nm.length();
        for(i=0;i<l;i++)
        {
            if(nm.charAt(i)=='a'||nm.charAt(i)=='e'||nm.charAt(i)=='i'||nm.charAt(i)=='o'||nm.charAt(i)=='u')
            {
                for(j=i;j<l;j++)
                {
                    System.out.print(nm.charAt(j));
                }
                break;
            }
        }
        for(n=0;n<i;n++)
        {
            System.out.print(nm.charAt(n));
        }
        System.out.print("ay");
    }
}