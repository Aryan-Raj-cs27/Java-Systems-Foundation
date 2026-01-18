import java.util.*;
class Greatest_Num
{
    public static void main(String args[])
    {
        int i,x,n,g=0,m=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        x = sc.nextInt();
        System.out.println("Enter the numbers :");
        for(i=1;i<=x;i++)
        {
            n = sc.nextInt();
            if (n>m)
            {
                g = n;
            }
        }
        System.out.println("Greatest number of all is "+g);
    }
}