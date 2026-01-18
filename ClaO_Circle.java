import java.util.*;
class ClaO_Circle
{
    double a,r;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of circle : ");
        r = sc.nextDouble();
    }
    void calc()
    {
        a = 3.14*r*r;
    }
    void display()
    {
        System.out.println("\nArea of Circle of Radius : "+r+" is = "+a);
    }
    public static void main(String args[])
    {
        ClaO_Circle obj = new ClaO_Circle();
        obj.input();
        obj.calc();
        obj.display();
    }
}