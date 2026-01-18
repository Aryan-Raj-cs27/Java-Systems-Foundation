import java.util.*;
class ClaO_ary1
{
    int n[]= new int[5];
    int i;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");   
        for(i=0;i<5;i++)
        {
            n[i] = sc.nextInt();
        }
    }
    void display()
    {
        System.out.print("Entered Number are : ");
        for(i=0;i<5;i++)
        {
            System.out.print(n[i]+"\t");
        }
    }
    public static void main(String args[])
    {
        ClaO_ary1 obj = new ClaO_ary1();
        obj.input();
        obj.display();
    }
}