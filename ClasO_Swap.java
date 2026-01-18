import java.util.*;
class ClasO_Swap
{
    int a,b;
    public void inputnum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    void calc()
    {
        b = b-a;
        a = a+b;
        b = a-b;
    }
    void display()
    {
        System.out.println("A after swapping = "+a);
        System.out.println("B after swapping = "+b);
    }
    public static void main(String args[])
    {
        ClasO_Swap obj = new ClasO_Swap();
        obj.inputnum();
        obj.calc();
        obj.display();
    }
}
