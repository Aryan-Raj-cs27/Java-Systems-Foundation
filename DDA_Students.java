//Jai Shree Ram //
import java.io.*;
class DDA_Students
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        // 10 Students DATA 
            // Intialising Variable
            int      code      [] = new int     [10];
            String   name      [] = new String  [10];
            String   address   [] = new String  [10];
            int      Class     [] = new int     [10];
            String   dob       [] = new String  [10];
            int      phy       [] = new int     [10];
            int      chem      [] = new int     [10];
            int      maths     [] = new int     [10];
            int      total     [] = new int     [10];
            double   average   [] = new double  [10];
            double   percent   [] = new double  [10];
            int id,i,j=0;
            // Storing Data of Students
            // 01
            code [0] = 101;
            name [0] = "Nihaal Raza";
            address [0] = "Harmu";
            Class [0] = 11;
            dob [0] = "10/02/2007";
            // 02
            code [1] = 102;
            name [1] = "Vikash Gupta";
            address [1] = "Madhukam";
            Class [1] = 10;
            dob [1] = "16/08/2008";
            // 03
            code [2] = 103;
            name [2] = "Athrav Shekhar";
            address [2] = "Ratu Road";
            Class [2] = 12;
            dob [2] = "17/01/2005";
            // 04
            code [3] = 104;
            name [3] = "Ashutosh Kumar";
            address [3] = "Rospa Tower";
            Class [3] = 12;
            dob [3] = "17/05/2004";
            // 05
            code [4] = 105;
            name [4] = "Arpit Minz";
            address [4] = "Doranda";
            Class [4] = 12;
            dob [4] = "30/09/2003";
            // 06
            code [5] = 106;
            name [5] = "Shivam Sharma";
            address [5] = "Namkum";
            Class [5] = 12;
            dob [5] = "27/12/2004";
            // 07
            code [6] = 107;
            name [6] = "Himanshu Ujjawal";
            address [6] = "Ashok Nagar";
            Class [6] = 9;
            dob [6] = "22/09/2004";
            // 08
            code [7] = 108;
            name [7] = "Bipul Raj Mahto";
            address [7] = "Gumala";
            Class [7] = 12;
            dob [7] = "21/08/2004";
            // 09
            code [8] = 109;
            name [8] = "Aryan Raj";
            address [8] = "Lajpat Nagar";
            Class [8] = 12;
            dob [8] = "14/02/2006";
            // 10
            code [9] = 110;
            name [9] = "Albert Rozer Murmur";
            address [9] = "Kolkata";
            Class [9] = 12;
            dob [9] = "31/10/2004";
        // Student Data Saved
        // Marks Program Continue
        for(i=1;i>0;i++)
        {
            System.out.print("Enter Student ID : ");
            id = Integer.parseInt(ob1.readLine());
            if(id>100 && id<111)
            {
                System.out.println("\n\n\tBishop Westcott Boys School");
                System.out.println("\tNamkum, Ranchi '834004'");
                System.out.println("\nStudent Id : "+id);
                System.out.println("Name : "+name[id-101]+"\t Class : "+Class[id-101]);
                System.out.println("Address : "+address[id-101]);
                System.out.println("Date of Birth : "+dob[id-101]);
                System.out.print("\nEnter Marks of Physics : ");
                phy[id-101] = Integer.parseInt(ob1.readLine());
                System.out.print("\nEnter Marks of Chemistry : ");
                chem[id-101] = Integer.parseInt(ob1.readLine());
                System.out.print("\nEnter Marks of Mathematics : ");
                maths[id-101] = Integer.parseInt(ob1.readLine());
                total[id-101] = phy[id-101]+chem[id-101]+maths[id-101];
                average[id-101] = total[id-101]/3;
                percent[id-101] = (total[id-101]*100)/300;
                // Printing Marksheet
                System.out.println("-----------------------------------------------------");
                System.out.println("\tBishop Westcott Boy's School");
                System.out.println("\tNamkum, Ranchi '834004'");
                System.out.println("\nMark Sheet of Student ID : "+id);
                System.out.println("\nName : "+name[id-101]+"\t Class : "+Class[id-101]);
                System.out.println("\nAddress : "+address[id-101]);
                System.out.println("\nDate of Birth : "+dob[id-101]);
                System.out.println("\nMarks of Physics : "+phy[id-101]);
                System.out.println("\nMarks of Chemistry : "+chem[id-101]);
                System.out.println("\nMarks of Mathematics : "+maths[id-101]);
                System.out.println("\nTotal Marks : "+total[id-101]+"/300\t Avergae Marks :"+average[id-101]);
                System.out.println("\nPercentage : "+percent[id-101]);
                System.out.println("-----------------------------------------------------");
                System.out.println("\n\n*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("|                   Enter 1 to 'EXIT'                 |");
                System.out.println("|                          OR                         |");
                System.out.println("| Enter any number either than 1 to Run program again |");
                System.out.println("*-----------------------------------------------------*");
                j = Integer.parseInt(ob1.readLine());
            }
            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
            System.out.println("|                      INVALID INPUT                    |");
            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
            if(j==1)
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