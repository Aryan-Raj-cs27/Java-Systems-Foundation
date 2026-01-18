import java.io.*;
class SwitCase_ACC
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        for(int i=1;i>0;i++)
        {
            double j = 0 , n = 0 , p = 0 , r = 0 , t = 0 , si = 0 , ci = 0 , sp = 0 , cp = 0 , pl = 0 , plp = 0 , f = 1 , R = 1 , c = 0;
            int m = 0;
            System.out.println("*--------------------------------------------*");
            System.out.println("|       Choose Option between 1 to 5         |");
            System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("|      (1) For Calculating Simple Intrest    |");
            System.out.println("|      (2) For Calculating Coumpound Intrest |");
            System.out.println("|      (3) For Calculating Profit or Loss    |");
            System.out.println("|      (4) For Calculating Factorial         |");
            System.out.println("|      (5) To Exit                           |");
            System.out.println("*--------------------------------------------*");
            System.out.println("");
            System.out.println("");
            System.out.print("  Entered : ");
            m = Integer.parseInt(ob1.readLine());
            switch (m)
            {
                case 1:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println();
                System.out.println("                                                  *--------------------------------------------*");
                System.out.println("                                                  |               Choosed Option               |");
                System.out.println("                                                  |              'Simple Interest'             |");
                System.out.println("                                                  *--------------------------------------------*");
                System.out.print(" Enter Principle Amount : ");
                p = Integer.parseInt(ob1.readLine());
                System.out.println();
                System.out.print(" Enter Rate percent : ");
                r = Integer.parseInt(ob1.readLine());
                System.out.println();
                System.out.print(" Enter Time period : ");
                t = Integer.parseInt(ob1.readLine());
                System.out.println();
                si = (p*r*t)/100;
                System.out.println("                                        Simple Interest of amount ' "+p+" ' for "+t+" years at "+r+" % = "+si );
                break;
                case 2:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println();
                System.out.println("                                                  *--------------------------------------------*");
                System.out.println("                                                  |               Choosed Option               |");
                System.out.println("                                                  |            'Coumpound Interest'            |");
                System.out.println("                                                  *--------------------------------------------*");
                System.out.print(" Enter Principle Amount : ");
                p = Integer.parseInt(ob1.readLine());
                System.out.println();
                System.out.print(" Enter Rate percent : ");
                r = Integer.parseInt(ob1.readLine());
                System.out.println();
                System.out.print(" Enter Time period : ");
                t = Integer.parseInt(ob1.readLine());
                System.out.println();
                for(j=1;j<=t;j++)
                {
                    R = R*(1+r/100);
                }
                ci = (p*R)-p;
                System.out.println("                                     Coumpound Interest of amount ' "+p+" ' for "+t+" years at "+r+" % = "+ci );
                break;
                case 3:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println();
                System.out.println("                                                  *--------------------------------------------*");
                System.out.println("                                                  |               Choosed Option               |");
                System.out.println("                                                  |              'Profit or Loss'              |");
                System.out.println("                                                  *--------------------------------------------*");
                System.out.print(" Enter Cost Price : ");
                cp = Integer.parseInt(ob1.readLine());
                System.out.println();
                System.out.print(" Enter Selling price : ");
                sp = Integer.parseInt(ob1.readLine());
                System.out.println();
                if(sp>cp)
                {
                    System.out.println("");
                    System.out.println("*--------------------------------------------*");
                    System.out.println("|              Profit Obtained :             |");
                    System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                    pl = sp-cp;
                    plp = pl*100/cp;
                    System.out.println("");
                    System.out.println("                 Profit = "+pl);
                    System.out.println("      Profit Percentage = "+plp);
                    System.out.println("*--------------------------------------------*");
                }
                else if(sp<cp)
                {
                    System.out.println("");
                    System.out.println("*--------------------------------------------*");
                    System.out.println("|               Loss Obtained :              |");
                    System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                    pl = cp-sp;
                    plp = pl*100/cp;
                    System.out.println("");
                    System.out.println("                 Loss = "+pl);
                    System.out.println("      Loss Percentage = "+plp);
                    System.out.println("*--------------------------------------------*");
                }
                else
                {
                    System.out.println("");
                    System.out.println("*--------------------------------------------*");
                    System.out.println("|           No 'LOSS' & No 'PROFIT'          |");
                    System.out.println("*--------------------------------------------*");
                }
                break;
                case 4:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println();
                System.out.println("                                                  *--------------------------------------------*");
                System.out.println("                                                  |                Choosed Option              |");
                System.out.println("                                                  |                 'Factorial'                |");
                System.out.println("                                                  *--------------------------------------------*");
                System.out.println();
                System.out.print("        Enter Number : ");
                n = Integer.parseInt(ob1.readLine());
                System.out.println();
                for(j=1;j<=n;j++)
                {
                    f = f*j;
                }
                System.out.println("");
                System.out.println("       Factorial of "+n+" = "+f);
                System.out.println("                                                  *--------------------------------------------*");
                break;
                case 5:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println();
                System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("|   'Thanks for giving your Precious Time'   |");
                System.out.println("*--------------------------------------------*");
                System.out.println("|                  EXITING.....              |");
                System.out.println("*--------------------------------------------*");
                break;
            }
            
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            if(m>5)
            {
                System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("|               INVALID INPUT                |");
                System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
            }
            if(m!=5)
            {
                System.out.println("                                               *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("                                               |                   Enter 1 to 'EXIT'                 |");
                System.out.println("                                               |                          OR                         |");
                System.out.println("                                               | Enter any number either than 1 to Run program again |");
                System.out.println("                                               *-----------------------------------------------------*");
                c = Integer.parseInt(ob1.readLine());
            }
            else
            {
                break;
            }
            if(c==1)
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