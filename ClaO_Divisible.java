import java.util.*;
class ClaO_Divisible
{
    int a,b;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        
    }
    void display()
    {
        if (a%b==0)
        {
          System.out.println(a+" is divisible by  "+b);
        }
        else
        {
          System.out.println(a+" is not divisible by  "+b);
        }
    }
    public static void main(String args[])
    {
        ClaO_Divisible obj = new ClaO_Divisible();
        obj.input();
        obj.display();
    }
}