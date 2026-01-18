import java.util.*;
class ClaO_Factorial
{
    int i,a,f;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get factorial :");
        a = sc.nextInt();
        f=1;
    }
    void calc()
    {
        for(i=1;i<=a;i++)
        {
            f=f*i;
        }
    }
    void display()
    {
        System.out.println("Factorial = "+f);
    }
    public static void main(String args[])
    {
        ClaO_Factorial obj = new ClaO_Factorial();
        obj.input();
        obj.calc();
        obj.display();
    }
}