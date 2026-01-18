import java.util.*;
class ClaO_Square
{
    int a,s;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of side of Square : ");
        s = sc.nextInt();
    }
    void calc()
    {
        a = s*s;
    }
    void display()
    {
        System.out.println("\nArea of Square of Side : "+s+" is = "+a);
    }
    public static void main(String args[])
    {
        ClaO_Square obj = new ClaO_Square();
        obj.input();
        obj.calc();
        obj.display();
    }
}