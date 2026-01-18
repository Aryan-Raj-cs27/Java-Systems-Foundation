import java.util.*;
class number_swap
{
    public static void main (String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        a = sc.nextInt();
        b = sc.nextInt();
        b = b-a;
        a = a+b;
        b = a-b;
        System.out.println("A after swapping = "+a);
        System.out.println("B after swapping = "+b);
    }
}