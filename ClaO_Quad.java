import java.util.*;
class ClaO_Quad
{
    int a,b,c,q;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of A : ");
        a = sc.nextInt();
        System.out.print("\nEnter Value of B : ");
        b = sc.nextInt();
        System.out.print("\nEnter Value of C : ");
        c = sc.nextInt();
    }
    void calc()
    {
        q = ((b*b)-1)*(4*a*c);
    }
    void display()
    {
        System.out.println("\nQuadratic Equation = "+q);
    }
    public static void main(String args[])
    {
        ClaO_Quad obj = new ClaO_Quad();
        obj.input();
        obj.calc();
        obj.display();
    }
}