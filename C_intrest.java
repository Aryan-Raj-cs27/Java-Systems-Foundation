import java.util.*;
class C_intrest
{
    public static void main(String args[])
    {
        double i,ci,p,r,t,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount :");
        p=sc.nextDouble();
        System.out.println("Enter the rate of compound intrest :");
        r = sc.nextDouble();
        System.out.println("Enter the Time :");
        t = sc.nextDouble();
        r = (1+r/100);
        n = r;
        for(i=1;i<t;i++)
        {
            m = n*r;
            n = m;
        }
        ci = (p*n)-p;
        System.out.println("Compound Intrest = "+ci);
    }
}