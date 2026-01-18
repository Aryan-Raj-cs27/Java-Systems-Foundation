import java.util.*;
class triangle
{
    public static void main(String args[])
    {
        double b,h,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth and height of triangle :");
        b = sc.nextDouble();
        h = sc.nextDouble();
        area = (b*h)/2;
        System.out.println("Area of triangle = "+area);
    }
}