import java.util.*;
class Middle_number
{
    public static void main(String args[])
    {
        int i,a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt(); 
        if (a>b&&a<c||a<b&&a>c)
        {
            System.out.println("Middle number is "+a);
        }
        else if (b>a&&b<c||b<a&&b>c)
        {
            System.out.println("Middle number is "+b);
        }
        else if (c>a&&c<b||c<a&&c>b)
        {
            System.out.println("Middle number is "+c);
        }
        else if(a==b && a!=c)
        {
            System.out.println("Two number is equal, middle is  "+c);
        }
        else if(a==c && a!=b)
        {
            System.out.println("Two number is equal, middle is  "+b);            
        }
        else if(c==b && c!=a)
        {
            System.out.println("Two number is equal, middle is  "+a);
        }
        else
        {
            System.out.println("All number is equal.");
        }
    }
}