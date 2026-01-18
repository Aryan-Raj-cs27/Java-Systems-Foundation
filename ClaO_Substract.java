import java.util.*;
class ClaO_Substract
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
        c = b-a;
    }
    void display()
    {
        System.out.println("\n"+a+" - "+b+" = "+c);
    }
    public static void main(String args[])
    {
        ClaO_Substract obj = new ClaO_Substract();
        obj.input();
        obj.calc();
        obj.display();
    }
}