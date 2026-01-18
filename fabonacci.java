import java.util.*;
class fabonacci
{
    public static void main(String args[])
    {
        int i,n,a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms need ?");
        n = sc.nextInt();
        a = 0;
        b = 1;
        c = 0;
        for(i=1;i<=n;i++)
        {
            System.out.println(""+c);
            a = b;
            b = c;
            c = a+b;
        }
    }
}