import java.io.*;
import java.lang.*;
class PATTERN
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        for(int i=1;i>0;i++)
        {
            int a,n;
            System.out.println("Enter the number between 1 to 12 for different type of pattern:");
            a = Integer.parseInt(ob1.readLine());
            if(a==1)
            {
                Pattern_1 p = new Pattern_1();
                p.P1();
            }
            else if(a==2)
            {
                Pattern_2 p = new Pattern_2();
                p.P2();
            }
            else if(a==3)
            {
                Pattern_3 p = new Pattern_3();
                p.P3();
            }
            else if(a==4)
            {
                Pattern_4 p = new Pattern_4();
                p.P4();
            }
            else if(a==5)
            {
                Pattern_5 p = new Pattern_5();
                p.P5();
            }
            else if(a==6)
            {
                Pattern_6 p = new Pattern_6();
                p.P6();
            }
            else if(a==7)
            {
                Pattern_7 p = new Pattern_7();
                p.P7();
            }
            else if(a==8)
            {
                Pattern_8 p = new Pattern_8();
                p.P8();
            }
            else if(a==9)
            {
                Pattern_9 p = new Pattern_9();
                p.P9();
            }
            else if(a==10)
            {
                Pattern_10 p = new Pattern_10();
                p.P10();
            }
            else if(a==11)
            {
                Pattern_11 p = new Pattern_11();
                p.P11();
            }
            else if(a==12)
            {
                Pattern_12 p = new Pattern_12();
                p.P12();
            }
            else
            {
                System.out.println("                                                   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("                                                   |               INVALID INPUT                |");
                System.out.println("                                                   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                break;
            }
                System.out.println("                                               *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("                                               |              Enter 1 to 'EXIT' or Enter             |");
                System.out.println("                                               |                          OR                         |");
                System.out.println("                                               | Enter any number either than 1 to Run program again |");
                System.out.println("                                               *-----------------------------------------------------*");
                n = Integer.parseInt(ob1.readLine());
            if(n==1)
            {
                System.out.println("                                                   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("                                                   |   'Thanks for giving your Precious Time'   |");
                System.out.println("                                                   *--------------------------------------------*");
                System.out.println("                                                   |                  EXITING.....              |");
                System.out.println("                                                   *--------------------------------------------*");
                break;
            }
        }
    }
}