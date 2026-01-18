import java.util.*;
class salary
{
    public static void main(String args[])
    {
        double sal,it,lic,loan,ds,ns;
        String name,adress,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employe :");
        name = sc.next();
        System.out.println("Enter the adress of the employe :");
        adress = sc.next();
        System.out.println("Enter the Designation of the emploe :");
        d = sc.next();
        System.out.println("Enter the salary of the employe :");
        sal = sc.nextDouble();
        it = 0.25*sal;
        ds = sal-it;
        lic = 0.01*ds;
        loan = 0.01*sal;
        ns = sal-(it+lic+loan);
        System.out.println("Name of the employe : "+name);     
        System.out.println("Adress of the employe : "+adress);    
        System.out.println("Designation of the employe : "+d);    
        System.out.println("Salary of the employe : "+sal);
        System.out.println("Income tax = "+it);
        System.out.println("Lic amount = "+lic);
        System.out.println("loan amount = "+loan);
        System.out.println("Net salary = "+ns);
    }
}