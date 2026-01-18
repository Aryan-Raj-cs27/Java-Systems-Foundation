import java.util.*;
class ClaO_Salary
{
    double sal,it,lic,loan,ds,ns;
    String name,adress,d;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employe :");
        name = sc.next();
        System.out.println("Enter the adress of the employe :");
        adress = sc.next();
        System.out.println("Enter the Designation of the emploe :");
        d = sc.next();
        System.out.println("Enter the salary of the employe :");
        sal = sc.nextDouble();
    }
    void calc()
    {
        it = 0.25*sal;
        ds = sal-it;
        lic = 0.01*ds;
        loan = 0.01*sal;
        ns = sal-(it+lic+loan);
    }
    void display()
    {
        System.out.println("Name of the employe : "+name);     
        System.out.println("Adress of the employe : "+adress);    
        System.out.println("Designation of the employe : "+d);    
        System.out.println("Salary of the employe : "+sal);
        System.out.println("Income tax = "+it);
        System.out.println("Lic amount = "+lic);
        System.out.println("loan amount = "+loan);
        System.out.println("Net salary = "+ns);
    }
    public static void main(String args[])
    {
        ClaO_Salary obj = new ClaO_Salary();
        obj.input();
        obj.calc();
        obj.display();
    }
}