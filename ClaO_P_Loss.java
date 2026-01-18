import java.util.*;
class ClaO_P_Loss
{
    double p,l,cp,sp,pp,lp;
    void input()
    {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the product : ");
        name = sc.next();
        System.out.println("Enter the Cost price :");
        cp = sc.nextInt();
        System.out.println("Enter the Selling price :");
        sp = sc.nextInt();
        System.out.println("Name of the product = "+name);
        System.out.println("Selling price = "+sp);
    }
    void calc()
    {
        if (cp<sp)
        {
            p = sp-cp;
            pp = (p/cp)*100;
        }
        else if (sp<cp)
        {
            l = cp-sp;
            lp = (l/cp)*100;
        }
    }
    void display()
    {
        if (cp<sp)
        {
          System.out.println("Profit = "+p);
          System.out.println("Profit percentage = "+pp);
        }
        else if (sp<cp)
        {
          System.out.println("Loss = "+l);
          System.out.println("Loss percentage = "+lp);
        }
        else
        {
          System.out.println("there is no profit  ");
        }
    }
    public static void main(String args[])
    {
        ClaO_P_Loss obj = new ClaO_P_Loss();
        obj.input();
        obj.calc();
        obj.display();
    }
}