import java.util.*;
class ClaO_Mid_num
{
    int i,a,b,c;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }
    void display()
    {
        if (a>b&&a<c||a<b&&a>c)
        {
            System.out.println("Middle number is "+a);
        }
        else if (b>a&&b<c||b<a&&b>c)
        {
            System.out.println("Middle number is "+b);
        }
        else if (c>a&&c<b||c<a&&c>b)
        {
            System.out.println("Middle number is "+c);
        }
        else if(a==b && a!=c)
        {
            System.out.println("Two number is equal, middle is  "+c);
        }
        else if(a==c && a!=b)
        {
            System.out.println("Two number is equal, middle is  "+b);            
        }
        else if(c==b && c!=a)
        {
            System.out.println("Two number is equal, middle is  "+a);
        }
        else
        {
            System.out.println("All number is equal.");
        }
    }
    public static void main(String args[])
    {
        ClaO_Mid_num obj = new ClaO_Mid_num();
        obj.input();
        obj.display();
    }
}