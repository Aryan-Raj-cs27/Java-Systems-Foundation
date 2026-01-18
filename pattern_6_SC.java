import java.util.*;
class pattern_6_SC
{
    public static void main(String args[])
    {
        int i,n,j,x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms :");
        n = sc.nextInt();
        y=n;
        for(i=1;i<=n;i++)
        {
            for(x=1;x<y;x++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
            y--;
        }
    }
}