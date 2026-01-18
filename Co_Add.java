import java.util.*;
class Co_Add
{
    int a,b,c;
    Co_Add(int x,int y)
    {
        a = x;
        b = y;
        c = a+b;
    }
    void display()
    {
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
        System.out.println("\n"+a+" + "+b+" = "+c);
    }
    public static void main(String args[])
    {
        int d,e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        d = sc.nextInt();
        System.out.println("Enter Second Number : ");
        e = sc.nextInt();
        Co_Add obj = new Co_Add(d,e);
        obj.display();
    }
}