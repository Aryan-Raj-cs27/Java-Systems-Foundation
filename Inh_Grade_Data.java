import java.util.*;
class Inh_Grade_Data
{
    Scanner sc = new Scanner(System.in);
    String nm,ad,dt,cl,rn;
    double m;
    void input_data()
    {
        System.out.print("Enter Name : ");
        nm = sc.nextLine();
        System.out.print("\nEnter Address : ");
        ad = sc.nextLine();
        System.out.print("\nEnter Date of birth : ");
        dt = sc.nextLine();
        System.out.print("\nEnter Class : ");
        cl = sc.nextLine();
        System.out.print("\nEnter Roll No. : ");    
        rn = sc.nextLine();
        System.out.print("\nEnter Marks : ");    
        m = sc.nextDouble();
    }
}