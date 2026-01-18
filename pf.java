import java.util.*;
class pf
{
    public static void main(String args[])
    {
        double b,ta,da,pf,hra,med,t;
        String name,adress,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Employe :");
        name = sc.next();
        System.out.println("Enter the Adress of the employe :");
        adress = sc.next();
        System.out.println("Enter the Designation :");
        d= sc.next();
        System.out.println("Enter the basic salary :");
        b = sc.nextDouble();
        System.out.println("Enter the travel expenses :");
        ta = sc.nextDouble();
        if(b>10000)
        {
            da = 0.09*b;
            pf = 0.03*(b+da);
            hra = 0.02*b;
            med = 0.01*b;
        }
        else
        {
            da = 0.07*b;
            pf = 0.03*(b+da);
            hra = 0.01*b;
            med = 0.05*b;   
        }
        t = (b+da-pf)+hra+med+ta;
        System.out.println("Total = "+t);
        }
    }
