import java.util.*;
class ClaO_Divide
{
    int a,b,c;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        a = sc.nextInt();
        System.out.print("\nEnter Second Number : ");
        b = sc.nextInt();        
    }
    void calc()
    {
        c = a/b;
    }
    void display()
    {
        System.out.println("\n"+a+" / "+b+" = "+c);
    }
    public static void main(String args[])
    {
        ClaO_Divide obj = new ClaO_Divide();
        obj.input();
        obj.calc();
        obj.display();
    }
}