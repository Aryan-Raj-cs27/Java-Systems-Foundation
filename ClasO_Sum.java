import java.util.*;
public class ClasO_Sum
{
    int a,b,c;
    public void inputnum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("\nEnter Second Number : ");
        b = sc.nextInt();
    }
    void calc()
    {
        c = a+b;
    }
    void display()
    {
        System.out.println("\n"+a+" + "+b+" = "+c);
    }
    public static void main(String args[])
    {
        ClasO_Sum2 obj = new ClasO_Sum2();
        obj.inputnum();
        obj.calc();
        obj.display();
    }
}