import java.util.*;
class ClaO_SI
{
    double p,r,t,si;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Value : ");
        p = sc.nextDouble();
        System.out.print("\nEnter Rate : ");
        r = sc.nextDouble();
        System.out.print("\nEnter Time Period : ");
        t = sc.nextDouble();
    }
    void calc()
    {
        si = (p*r*t)/100;
    }
    void display()
    {
        System.out.println("Simple Intrest of "+p+" for "+t+" Year at "+r+" %  is = "+si);
    }
    public static void main(String args[])
    {
        ClaO_SI obj = new ClaO_SI();
        obj.input();
        obj.calc();
        obj.display();
    }
}