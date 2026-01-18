import java.util.*;
class Inh_Ci_details
{
    Scanner sc = new Scanner(System.in);
    public String nm,ad,dt;
    void input_Details()
    {
        System.out.print("Enter Name : ");
        nm = sc.nextLine();
        System.out.print("\nEnter Address : ");
        ad = sc.nextLine();
        System.out.print("\nEnter Date : ");
        dt = sc.nextLine();
    }
}