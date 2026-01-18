import java.util.*;
class Co_Quad
{
    double quad;
    Co_Quad(double a ,double b ,double c)
    {
        quad = (b*b-1)*(4*a*c);
    }
    void display()
    {
        System.out.println("Quadilateral = "+quad);
    }
    public static void main(String args[])
    {
        Double x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        Co_Quad obj = new Co_Quad(x,y,z);
        obj.display();
    }
}