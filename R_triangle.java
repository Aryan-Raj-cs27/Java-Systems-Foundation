import java.util.*;
class R_triangle
{
    public static void main(String args[])
    {
        int l,h,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and height of right angle triangle :");
        l = sc.nextInt();
        h = sc.nextInt();
        area = l*h;
        System.out.println("Area of triangle = "+area);
    }
}