import java.util.*;
class ClaO_ary_P_loss
{
    int i,j,t=0;
    String nm[] = new String[5];
    int pl[] = new int[5];
    int cp[] = new int[5];
    int sp[] = new int[5];
    void input()
    {
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("0"+(i+1)+".\n");
            System.out.print("Enter Item name : ");
            nm[i] = sc.next();
            System.out.print("\nEnter "+nm[i]+" Cost price : ");
            cp[i] = sc.nextInt();
            System.out.print("\nEnter "+nm[i]+" Selling price : ");
            sp[i] = sc.nextInt();
            System.out.println("");
        }
    }
    void calc()
    {
        for(j=0;j<5;j++)
        {
            if(sp[j]>cp[j])
            {
                pl[j] = sp[j]-cp[j];
                t = t+pl[j];
            }
            else if(sp[j]<cp[j])
            {
                pl[j] = cp[j]-sp[j];
                t = t-pl[j];
            }
        }
    } 
    void display()
    {
        System.out.println("");
        System.out.println("*------------------------------------------------------------*");
        System.out.println("| S no.\tName\tCost Price\tSelling Price\tProfit |");
        System.out.println("*------------------------------------------------------------*");
        for(j=0;j<5;j++)
        {
            System.out.print("    "+(j+1)+".");
            System.out.print("\t"+nm[j]);
            System.out.print("\t"+cp[j]);
            System.out.print("\t\t"+sp[j]);
            if(sp[j]>cp[j])
            {
                System.out.print("\t\t+"+pl[j]);
            }
            else if(sp[j]<cp[j])
            {
                System.out.print("\t\t-"+pl[j]);
            }
            else
            {
                System.out.print("\t\t00");
            }
            System.out.println("");
        }
        System.out.println("*------------------------------------------------------------*");
        System.out.println("  Total =                                       "+t);
        System.out.println("*------------------------------------------------------------*");
    }
    public static void main(String args[])
    {
        ClaO_ary_P_loss obj = new ClaO_ary_P_loss();
        obj.input();
        obj.calc();
        obj.display();
    }
}