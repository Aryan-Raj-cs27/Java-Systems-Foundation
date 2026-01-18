import java.util.*;
class Co_Ci
{
    double p,r,t,ci,Rate;
    Co_Ci(double P,double R,double T)
    {
        p = P;
        r = R;
        t = T;
        Rate = 1;
        for(int i = 1;i<=t;i++)
        {
            Rate = Rate*(1+r/100);
        }
        ci = (p*Rate)-p;
    }
    void display()
    {
        System.out.println("Cumpound Intrest of "+p+" for "+r+"years at "+r+"% = "+ci);
    }
    public static void main(String args[])
    {
        double x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle , rate and time :");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        Co_Ci obj = new Co_Ci(x,y,z);
        obj.display();
    }
}