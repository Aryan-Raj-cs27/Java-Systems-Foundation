import java.util.*;
class square
{
    public static void main(String args[])
    {
        double l,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of square :");
        l = sc.nextDouble();
        area = l*l;
        System.out.println("Area of square = "+area);
    }
}