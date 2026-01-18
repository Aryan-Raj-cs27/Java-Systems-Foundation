import java.util.*;
class ClaO_Multi
{
    int a,b,c;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("\nEnter Second Number : ");
        b = sc.nextInt();
    }
    void calc()
    {
        c = a*b;
    }
    void display()
    {
        System.out.println("\n"+a+" x "+b+" = "+c);
    }
    public static void main(String args[])
    {
        ClaO_Multi obj = new ClaO_Multi();
        obj.input();
        obj.calc();
        obj.display();
    }
}