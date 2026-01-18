import java.util.*;
class ClaO_Greater
{
    int a,b;        
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    void display()
    {
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
    public static void main(String args[])
    {
        ClaO_Greater obj = new ClaO_Greater();
        obj.input();
        obj.display();
    }
}