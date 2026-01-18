import java.util.*;
class ClaO_ary_detail
{
    String nm[] = new String[5];
    String ad[] = new String[5];
    int sal[] = new int[5];
    int i;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.print("Enter "+(i+1)+" Employee Name : ");
            nm[i] = sc.next();
            System.out.print("\nEnter "+nm[i]+" Address : ");
            ad[i] = sc.next();
            System.out.print("\nEnter "+nm[i]+" Salary : ");
            sal[i] = sc.nextInt();
            System.out.print("\n\n");
        }
    }
    void display()
    {
        for(i=0;i<5;i++)
        {
            System.out.println("\n"+(i+1)+".)");
            System.out.println("\nName : "+nm[i]);
            System.out.println("\nAddress : "+ad[i]);
            System.out.println("\nSalary : "+sal[i]);
        }
    }
    public static void main(String args[])
    {
        ClaO_ary_detail obj = new ClaO_ary_detail();
        obj.input();
        obj.display();
    }
}