import java.util.*;
class eleven_multi
{
    public static void main(String args[])
    {
        int i,n,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms needed :");
        n = sc.nextInt();
        a = 1;
        for (i=1;i<=n;i++)
        {
            System.out.println(a);
            a = a*11;
        }
    }
}