import java.util.*;
class ClaO_R_tri
{
    int a,l,h;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Right angle Triangle : ");
        l = sc.nextInt();
        System.out.print("\nEnter Height of Right angle Triangle : ");
        h = sc.nextInt();
    }
    void calc()
    {
        a = l*h;
    }
    void display()
    {
        System.out.println("\nArea of Right angle Triangle of Length "+l+", & Height "+h+" is : "+a); 
    }
    public static void main(String args[])
    {
        ClaO_R_tri obj = new ClaO_R_tri();
        obj.input();
        obj.calc();
        obj.display();
    }
}