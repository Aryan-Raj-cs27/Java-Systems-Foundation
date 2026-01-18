import java.util.*;
class Divisible
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a%b==0)
        {
          System.out.println(a+" is divisible by  "+b);
        }
        else
        {
          System.out.println(a+" is not divisible by  "+b);
        }
    }
}