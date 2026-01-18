import java.util.*;
class HCF
{
    public static void main(String args[])
    {
        int i,n,m,h=0,b=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number:");
        n = sc.nextInt();
        System.out.println("Enter the Second number:");
        m = sc.nextInt();
        if (n>m)
        {
            b = n;
        }
        else
        {
            b = m;
        }
        for(i=1;i<=b;i++)
        {
            if(n%i==0&&m%i==0)
            {
                h = i;
            }
        }
        System.out.println("");
        System.out.println("HCF of "+n+" and "+m+" is = "+h);
    }
}