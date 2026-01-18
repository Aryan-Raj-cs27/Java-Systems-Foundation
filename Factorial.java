import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        int i,a,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get factorial :");
        a = sc.nextInt();
        f=1;
        for(i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial = "+f);
    }
}