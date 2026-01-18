import java.io.*;
class ary_Bill_Pro
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        int i;
        for(i=1;i>0;i++)
        {
            String nm,ad,dt;
            String check;
            int run=0,k,j,tot=0,l=0;
            String item[] = new String[100];
            int q[] = new int[100];
            int r [] = new int[100];
            System.out.print("Enter name of customer : ");
            nm = ob1.readLine();
            System.out.println();
            System.out.print("Enter adress of customer : ");
            ad = ob1.readLine();
            System.out.println();
            System.out.print("Enter Date : ");
            dt = ob1.readLine();
            for(j=0;j<100;j++)
            {
                System.out.println("\nEnter item name : ");
                item[j] = ob1.readLine();
                run++;
                System.out.println("\nEnter rate of "+item[j]+" : ");
                r[j] = Integer.parseInt(ob1.readLine());
                System.out.println("\nEnter quantity of "+item[j]+" : ");
                q[j] = Integer.parseInt(ob1.readLine());
                for(k=1;k>0;k++)
                {
                    System.out.println("\n\nEnter y for more item or Enter p to print BILL : ");
                    check = ob1.readLine();
                    if(check.charAt(0)=='y')
                    {
                        l = 1;
                        break;
                    }
                    else if (check.charAt(0)=='p')
                    {
                        l = 2;
                        break;
                    }
                    else
                    {
                        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                        System.out.println("|                      INVALID INPUT                    |");
                        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                    }
                }
                if(l==1)
                {
                    
                }
                else if(l==2)
                {
                    break;
                }
            }
            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
            System.out.println("|                       City Grocery                    |");
            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
            System.out.println();
            System.out.println("    Date :"+dt);
            System.out.println();
            System.out.println("    Name : "+nm);
            System.out.println();
            System.out.println(" Address : "+ad);
            System.out.println();
            System.out.println("*-------------------------------------------------------*");
            System.out.println("| S No.| Item \t| \tQuantity \t| Rate \t| Amount |");
            System.out.println("*-------------------------------------------------------*");
            for(k=0;k<run;k++)
            {
                System.out.println("    "+(k+1)+" "+item[k]+" \t \t"+q[k]+" \t\t "+r[k]+" \t\t "+(q[k]*r[k]));
                tot = tot+(q[k]*r[k]);
            }
            System.out.println("*-------------------------------------------------------*");
            System.out.println("                               Total = "+tot);
            System.out.println("*-------------------------------------------------------*");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for(k=1;k>0;k++)
            {
                System.out.println();
                System.out.println("Enter n for next Bill or e to exit");
                check = ob1.readLine();
                if(check.charAt(0)=='n')
                {
                    l = 1;
                    break;
                }
                else if (check.charAt(0)=='e')
                {
                    l = 2;
                    break;
                }
                else
                {
                    System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                    System.out.println("|                      INVALID INPUT                    |");
                    System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                }
            }
            if(l==1)
            {
                
            }
            else if(l==2)
            {
                System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("|   'Thanks for giving your Precious Time'   |");
                System.out.println("*--------------------------------------------*");
                System.out.println("|                  EXITING.....              |");
                System.out.println("*--------------------------------------------*");
                break;
            }
        }
    }
}