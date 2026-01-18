import java.util.*;
class Sal
{
    public static void main (String args[])
    {
        int sal;
        int hra,da,gs;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary of the Employee :");
        sal = sc.nextInt();
        if (sal<1500)
        {
            hra = (sal*10)/100;
            da = (sal*90)/100;
            gs = sal+hra+da;
            System.out.println("Gross salary : "+gs);
        }
        else if (sal>=1500)
        {
            hra = 500;
            da = (sal*98)/100;
            gs = sal+hra+da;
            System.out.println("Gross salary : "+gs);
        }
    }
}