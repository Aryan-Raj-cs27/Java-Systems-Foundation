import java.util.*;
class Special_no
{
    public static void main(String args[])
    {
        int i,m,n,x,j,f=1,a=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        m = n;
        for(i=1;i<=3;i++)
        {
            x = m%10;
            for(j=1;j<=x;j++)
            {
                f = f*j;
            }
            a = a+f;
            m = (m-x)/10;
            f=1;
        }
        if(a==n)
        {
           System.out.println(n+" is Special number.");
        }
        else
        {
           System.out.println(n+" is not a Special number.");
        }
    }
}