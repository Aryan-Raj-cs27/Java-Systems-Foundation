import java.util.*;
class circle
{
    public static void main(String args[])
    {
        double pie,r,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle :");
        r = sc.nextDouble();
        pie = 3.14;
        area = pie*r*r;
        System.out.println("Area of circle = "+area);
    }
}