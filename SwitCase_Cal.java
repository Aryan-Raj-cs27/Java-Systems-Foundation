import java.io.*;
import java.util.*; 
class SwitCase_Cal
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        for(int i=1;i>0;i++)
        {
            int n = 0,a = 0,b = 0,m=1;
            double t=0;
            System.out.println("                                                   *--------------------------------------------*");
            System.out.println("                                                   |       Choose Option between 1 to 5         |");
            System.out.println("                                                   |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("                                                   |      (1) For Addition of Two number        |");
            System.out.println("                                                   |      (2) For Subtraction of Two number     |");
            System.out.println("                                                   |      (3) For Multiplication of Two number  |");
            System.out.println("                                                   |      (4) For Division of Two number        |");
            System.out.println("                                                   |      (5) To Exit                           |");
            System.out.println("                                                   *--------------------------------------------*");
            System.out.println("");
            System.out.println("");
            System.out.print("                                                   Entered : ");
            n = Integer.parseInt(ob1.readLine());
            switch(n)
            {
                case 1:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("                                                  *--------------------------------------------*");
                System.out.println("                                                                  Choosed Option               ");
                System.out.println("                                                                    'ADDITION'                 ");
                System.out.println("                                                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("                                                    Enter The First Number : ");
                a = Integer.parseInt(ob1.readLine());
                System.out.println();
                System.out.print("                                                    Enter The Second Number : ");   
                b = Integer.parseInt(ob1.readLine());
                System.out.println();
                t = a+b;
                System.out.println("                                                  Sum of "+a+" + "+b+" = "+t);
                break;
                case 2:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("                                                  *--------------------------------------------*");
                System.out.println("                                                                  Choosed Option               ");
                System.out.println("                                                                    'SUBTRACTION'                 ");
                System.out.println("                                                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                                                    Enter The First Number : ");
                a = Integer.parseInt(ob1.readLine());
                System.out.println();
                System.out.println("                                                    Enter The Second Number : ");   
                b = Integer.parseInt(ob1.readLine());
                System.out.println();
                if(a>b)
                {
                    t = a-b;
                }
                else if(a<b)
                {
                    t = b-a;
                }
                else
                {
                    t = a-b;
                }
                System.out.println("                                                    Difference between "+a+" - "+b+" = "+t);
                break;
                case 3:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("                                                  *--------------------------------------------*");
                System.out.println("                                                                  Choosed Option               ");
                System.out.println("                                                                  'MULTIPLICATION'                 ");
                System.out.println("                                                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                                                    Enter The First Number : ");
                a = Integer.parseInt(ob1.readLine());
                System.out.println();
                System.out.println("                                                    Enter The Second Number : ");   
                b = Integer.parseInt(ob1.readLine());
                System.out.println();
                t = a*b;
                System.out.println("                                                    Multiplication of "+a+" X "+b+" = "+t);
                break;
                case 4:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("                                                  *--------------------------------------------*");
                System.out.println("                                                                  Choosed Option               ");
                System.out.println("                                                                    'DIVISION'                 ");
                System.out.println("                                                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                                                    Enter The First Number : ");
                a = Integer.parseInt(ob1.readLine());
                System.out.println();
                System.out.println("                                                    Enter The Second Number : ");
                b = Integer.parseInt(ob1.readLine());
                System.out.println();
                if(a>b)
                {
                    t = a/b;
                }
                else if(a<b)
                {
                    t = b/a;
                }
                else
                t = a/b;
                System.out.println("                                                    Division of "+a+" / "+b+" = "+t);
                break;
                case 5:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("                                                   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("                                                   |   'Thanks for giving your Precious Time'   |");
                System.out.println("                                                   *--------------------------------------------*");
                System.out.println("                                                   |                  EXITING.....              |");
                System.out.println("                                                   *--------------------------------------------*");
                break;
            }
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            if(n>5)
            {
                System.out.println("                                                   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("                                                   |               INVALID INPUT                |");
                System.out.println("                                                   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
            }
            if(n!=5)
            {
                System.out.println("                                               *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("                                               |                   Enter 1 to 'EXIT'                 |");
                System.out.println("                                               |                          OR                         |");
                System.out.println("                                               | Enter any number either than 1 to Run program again |");
                System.out.println("                                               *-----------------------------------------------------*");
                m = Integer.parseInt(ob1.readLine());
            }
            else
            {
                break;
            }
            if(m==1)
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