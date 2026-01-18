import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        int i,n,x,m,b,g,a=0,f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        b = n;
        for (i=1;i<=3;i++)
        {
            x = b%10;
            g = (x*x*x);
            a = a+g;
            b = b/10;
        }
        if (a==n)
        {
            System.out.println(n+" is Armstrong number.");
        }
        else
        {
            System.out.println(n+" is not a Armstrong number.");
        }
    }
}