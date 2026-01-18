import java.util.*;
class quad
{
    public static void main(String args[])
    {
        double b,a,c,quad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c :");
        b = sc.nextDouble();
        a = sc.nextDouble();
        c = sc.nextDouble();
        quad = ((b*b)-1)*(4*a*c);
        System.out.println("quadratic equation = "+quad);
    }
}