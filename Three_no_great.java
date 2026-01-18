import java.util.*;
class Three_no_great
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>b&&a>c)
        {
                System.out.println("Greatest number is "+a);
        }
        else if (b>a&&b>c)
        {
                System.out.println("Greatest number is "+b);
        }
        else if (c>b&&c>a)
        {
                System.out.println("Greatest number is "+c);
        }
        else
        {
            System.out.println("All number is equal.");
        }
    }
}