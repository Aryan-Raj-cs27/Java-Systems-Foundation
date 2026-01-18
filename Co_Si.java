import java.util.*;
class Co_Si
{
    double p,r,t,si;
    Co_Si(double a ,double b , double c)
    {
        p = a;
        r = b;
        t = c;
        si = (p*r*t)/100;
    }
    void display()
    {
        System.out.println("Simple Intrest of "+p+" for "+t+" years at "+r+"% = "+si);
    }
    public static void main(String args[])
    {
        double x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount, Rate , Time :");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        Co_Si obj = new Co_Si(x,y,z);
        obj.display();
    }
}