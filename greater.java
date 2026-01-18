import java.util.*;
class greater
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a>b)
        {
          System.out.println("Greater number is : "+a);
        }
        else if (a<b)
        {
          System.out.println("Greater number is : "+b);
        }
        else
        {
          System.out.println("Both value is equal ");
        }
    }
}