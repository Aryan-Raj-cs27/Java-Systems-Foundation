import java.util.*;
class ClaO_Result
{
    double clas,p,c,m,t,a,per;
    String name;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        name = sc.next();
        System.out.print("\nEnter the Class of "+name+" : ");
        clas = sc.nextDouble();
        System.out.print("\nEnter the marks of physics of student : ");
        p = sc.nextDouble();        
        System.out.print("\nEnter the marks of chemistryof student : ");
        c = sc.nextDouble();
        System.out.print("\nEnter the marks of math of student : ");
        m = sc.nextDouble();
    }
    void calc()
    {
        t = p+c+m;
        a = t/3;
        per = (t*100)/300;
    }
    void display()
    {
        System.out.println("*---------------------------------------------------------------------");
        System.out.println("| Name\t\tClass\t\tPhy\t\tChem\t\tMaths");
        System.out.println("*---------------------------------------------------------------------");
        System.out.print("  "+name+"\t\t");
        System.out.print(clas+"\t\t");
        System.out.print(p+"\t\t");
        System.out.print(c+"\t\t");
        System.out.print(m+"\t\t");
        System.out.print("\n\nTotal = ");
        System.out.print(t+"\t");
        System.out.print("\tAverage = ");
        System.out.print(a+"\t");
        System.out.print("\tTotal = ");
        System.out.print(per+"\t");
        System.out.println("");
    }
    public static void main(String args[])
    {
        ClaO_Result obj = new ClaO_Result();
        obj.input();
        obj.calc();
        obj.display();
    }
}