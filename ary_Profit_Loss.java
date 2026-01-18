import java.io.*;
class ary_Profit_Loss
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        int i,j,pl,t=0;
        String nm[] = new String[5];
        int cp[] = new int[5];
        int sp[] = new int[5];
        for(i=0;i<5;i++)
        {
            System.out.println("0"+(i+1)+".\n");
            System.out.print("Enter Item name : ");
            nm[i] = ob1.readLine();
            System.out.print("\nEnter "+nm[i]+" Cost price : ");
            cp[i] = Integer.parseInt(ob1.readLine());
            System.out.print("\nEnter "+nm[i]+" Selling price : ");
            sp[i] = Integer.parseInt(ob1.readLine());
            System.out.println("");
        }
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
                pl = sp[j]-cp[j];
                System.out.print("\t\t+"+pl);
                t = t+pl;
            }
            else if(sp[j]<cp[j])
            {
                pl = cp[j]-sp[j];
                System.out.print("\t\t-"+pl);
                t = t-pl;
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
}