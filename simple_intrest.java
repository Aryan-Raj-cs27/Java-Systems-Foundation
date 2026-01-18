import java.util.*;
class simple_intrest
{
    public static void main(String args[])
    {
        double p,r,t,si;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of principle, rate and time :");
        p = sc.nextDouble();
        r = sc.nextDouble();
        t = sc.nextDouble();
        si = (p*r*t)/100;
        System.out.println("Simple intrest = "+si);
    }
}