import java.util.*;
class Inh_Ci_Data extends Inh_Ci_details
{
    Scanner sc = new Scanner(System.in);
    public double p,r,t,rate=1,ci;
    void input_data()
    {
        System.out.print("\nEnter Principle Amount : ");
        p = sc.nextDouble();
        System.out.print("\nEnter Rate : ");
        r = sc.nextDouble();
        System.out.print("\nEnter Time : ");
        t = sc.nextDouble();
    }
    void calc()
    {
        for(int i=1;i<=t;i++)
        {
            rate = rate*(1+r/100);
        }
        ci = (p*rate)-p;
    }
}
