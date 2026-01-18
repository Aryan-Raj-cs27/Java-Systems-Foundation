import java.util.*;
class ClaO_Triangle
{
    int l,b;
    double a;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Triangle : ");
        l = sc.nextInt();
        System.out.print("\nEnter Breadth of Triangle : ");
        b = sc.nextInt();
    }
    void calc()
    {
        a = (l*b)/2;
    }
    void display()
    {
        System.out.println("\nArea of Triangle of Length "+l+", & Breadth "+b+" is = "+a);
    }
    public static void main(String args[])
    {
        ClaO_Triangle obj = new ClaO_Triangle();
        obj.input();
        obj.calc();
        obj.display();
    }
}