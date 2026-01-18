//Jai Shree Ram //
import java.io.*;
class ary_Marks_Pro
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
            int id,id1=0,id2=0,i,j=1,k,n,m=1,c=0,Last=9;
            // Storing Data of Students
            // 01
            code    [0]   = 101;
            name    [0]   = "Albert";
            address [0]   = "Harmu";
            Class   [0]   = 11;
            dob     [0]   = "10/02/2007";
            // 02
            code    [1]   = 102;
            name    [1] = "Himans";
            address [1] = "Madhuk";
            Class   [1] = 10;
            dob     [1] = "16/08/2008";
            // 03
            code    [2] = 103;
            name    [2] = "Bipul";
            address [2] = "Ratu";
            Class   [2] = 12;
            dob     [2] = "17/01/2005";
            // 04
            code    [3] = 104;
            name    [3] = "Athrav";
            address [3] = "Rospa";
            Class   [3] = 12;
            dob     [3] = "17/05/2004";
            // 05
            code    [4] = 105;
            name    [4] = "Ashuto";
            address [4] = "Dorand";
            Class   [4] = 12;
            dob     [4] = "30/09/2003";
            // 06
            code    [5] = 106;
            name    [5] = "Shivam";
            address [5] = "Namkum";
            Class   [5] = 12;
            dob     [5] = "27/12/2004";
            // 07
            code    [6] = 107;
            name    [6] = "Vikash";
            address [6] = "Ashok";
            Class   [6] = 11;
            dob     [6] = "22/09/2004";
            // 08
            code    [7] = 108;
            name    [7] = "Nihaal";
            address [7] = "Gumala";
            Class   [7] = 12;
            dob     [7] = "21/08/2004";
            // 09
            code    [8] = 109;
            name    [8] = "Arpit";
            address [8] = "Lajpat";
            Class   [8] = 12;
            dob     [8] = "14/02/2006";
            // 10
            code    [9] = 110;
            name    [9] = "Aryan";
            address [9] = "Kolkat";
            Class   [9] = 12;
            dob     [9] = "31/10/2004";
        // Student Data Saved
        // MarkSheet Continue
        for(i=1;i>0;i++)
        {
            System.out.println("Press 1 to Enter New Student                   :");
            System.out.println("Press 2 to Marks Print                         : ");
            System.out.println("Press 3 to Marks Search                        : ");
            System.out.println("Press 4 to Edit Student Profile or Enter Marks : ");
            System.out.println("Press 5 to Delete Student profile              : ");
            System.out.println("Press 6 to Exit                                : ");
            n = Integer.parseInt(ob1.readLine());
            switch(n)
            {
                case 1:
                {
                    System.out.println("Marks Entry Selected : ");
                    for(j=1;j>0;j++)
                    {
                        System.out.print("\nEnter Student Unique ID : ");
                        id = Integer.parseInt(ob1.readLine()); 
                        if(id>100 && id<Last+102)
                        {
                            System.out.println("\n\n\tBishop Westcott Boys School");
                            System.out.println("\tNamkum, Ranchi '834004'");
                            System.out.println("\nStudent Id : "+id);
                            id -= 101;
                            System.out.println("Name : "+name[id]+"\t Class : "+Class[id]);
                            System.out.println("Address : "+address[id]);
                            System.out.println("Date of Birth : "+dob[id]);
                            for(k=1;k>0;k++)
                            {
                                System.out.print("\nTo Enter all Subject Marks Enter 1  : ");
                                System.out.print("\nTo Enter Marks of Physics Enter 2   : ");
                                System.out.print("\nTo Enter Marks of Chemistry Enter 3 : ");
                                System.out.print("\nTo Enter Marks of Maths Enter 4     : ");
                                System.out.print("\nTo EXIT Enter 5                     : ");
                                c = Integer.parseInt(ob1.readLine());
                                switch(c)
                                {
                                    case 1:
                                    {
                                        System.out.print("\nEnter Marks of Physics : ");
                                        phy[id] = Integer.parseInt(ob1.readLine());
                                        System.out.print("\nEnter Marks of Chemistry : ");
                                        chem[id] = Integer.parseInt(ob1.readLine()); 
                                        System.out.print("\nEnter Marks of Mathematics : ");
                                        maths[id] = Integer.parseInt(ob1.readLine());
                                        break;
                                    }
                                    case 2:
                                    {
                                        System.out.print("\nEnter Marks of Physics : ");
                                        phy[id] = Integer.parseInt(ob1.readLine());
                                        break;
                                    }
                                    case 3:
                                    {
                                        System.out.print("\nEnter Marks of Chemistry : ");
                                        chem[id] = Integer.parseInt(ob1.readLine());    
                                        break;
                                    }
                                    case 4:
                                    {
                                        System.out.print("\nEnter Marks of Mathematics : ");
                                        maths[id] = Integer.parseInt(ob1.readLine());
                                        break;
                                    }
                                    case 5:
                                    {
                                        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                                        System.out.println("|   'Thanks for giving your Precious Time'   |");
                                        System.out.println("*--------------------------------------------*");
                                        System.out.println("|                  EXITING.....              |");
                                        System.out.println("*--------------------------------------------*");
                                        break;
                                     }
                                }
                                total  [id] = phy[id]+chem[id]+maths[id];
                                average[id] = total[id]/3;
                                percent[id] = (total[id]*100)/300;
                                if(c==5)
                                {
                                    break;
                                }
                                else if(c>5 || c<1)
                                {
                                    System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                                    System.out.println("|                      INVALID INPUT                    |");
                                    System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                                    System.out.println("|                   Enter 1 to 'EXIT'                   |");
                                    System.out.println("|                          OR                           |");
                                    System.out.println("|  Enter any number either than 1 to Enter Number again |");
                                    System.out.println("*-------------------------------------------------------*");
                                    m = Integer.parseInt(ob1.readLine());
                                    if(m==1)
                                    {
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                                    System.out.println("| Marks Saved Thanks for giving your Precious Time      |");
                                    System.out.println("*-------------------------------------------------------*");
                                    System.out.println("|                   Enter 1 to 'EXIT'                   |");
                                    System.out.println("|                          OR                           |");
                                    System.out.println("|  Enter any number either than 1 to Enter Marks again  |");
                                    System.out.println("*-------------------------------------------------------*");
                                    m = Integer.parseInt(ob1.readLine());
                                    if(m==1)
                                    {
                                        break;
                                    }
                                }
                            }
                        }
                        else
                        {
                            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                            System.out.println("|                      INVALID INPUT                    |");
                            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                            System.out.println("|                   Enter 1 to 'EXIT'                   |");
                            System.out.println("|                          OR                           |");
                            System.out.println("|   Enter any number either than 1 to Enter ID again    |");
                            System.out.println("*-------------------------------------------------------*");
                            m = Integer.parseInt(ob1.readLine());
                        }
                        if(m==1)
                        {
                            break;
                        }
                        if(c==5)
                        {
                            break;
                        }
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Marks Print Selected : ");
                    for(j=1;j>0;j++)
                    {
                        j=1;
                        System.out.println("Enter Student Code to Start & End : ");
                        System.out.println("Enter '0' & '9' to Print All Student Details : ");
                        id1 = Integer.parseInt(ob1.readLine());
                        if(id1>100 && id1<Last+102)
                        {
                            id2 = Integer.parseInt(ob1.readLine());
                            if(id2>id1 && id2<Last+102)
                            {
                                id1 -= 101;
                                id2 -= 101;
                                j=0;
                            }
                        }
                        else if(id1==0)
                        {
                            id2 = Integer.parseInt(ob1.readLine());
                            if(id2==9)
                            {
                               j=0;
                               id2 = Last;
                            }
                        }
                        if(j==1)
                        {
                            j=1;
                                System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                                System.out.println("|                      INVALID INPUT                    |");
                                System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                                System.out.println("|                   Enter 1 to 'EXIT'                   |");
                                System.out.println("|                          OR                           |");
                                System.out.println("|   Enter any number either than 1 to Enter ID again    |");
                                System.out.println("*-------------------------------------------------------*");
                                m = Integer.parseInt(ob1.readLine());
                            if(m==1)
                            {
                                break;
                            }
                        }
                        if(j==0)
                        {
                            System.out.println("*------------------------------------------------------------------------------------------------");
                            System.out.println("| Code\tName\tClass\tAdress\tDOB\t\tPhy\tChem\tMaths\tAverage\tPercent\tTotal\t");
                            System.out.println("*--------------------------------------------------------------------------------------------");
                            for(j=id1;j<=id2;j++)
                            {
                                System.out.print(" "+code[j]+"\t");
                                System.out.print(name[j]+"\t");
                                System.out.print(Class[j]+"\t");
                                System.out.print(address[j]+"\t");
                                System.out.print(dob[j]+"\t");
                                System.out.print(phy[j]+"\t");
                                System.out.print(chem[j]+"\t");
                                System.out.print(maths[j]+"\t");
                                System.out.print(average[j]+"\t");
                                System.out.print(percent[j]+"\t");
                                System.out.print(total[j]+"\t");
                                System.out.println("");
                            }
                            break;
                        }
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Marks Search Selected :");
                    for(j=1;j>0;j++)
                    {
                        System.out.print("Enter Student ID : ");
                        id = Integer.parseInt(ob1.readLine());
                        if(id>100 && id<Last+102)
                        {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tBishop Westcott Boy's School");
                            System.out.println("\tNamkum, Ranchi '834004'");
                            System.out.println("\nMark Sheet of Student ID : "+id);
                            id -= 101;
                            System.out.println("\nName    : "+name[id]+"\t Class : "+Class[id]);
                            System.out.println("\nAddress : "+address[id]);
                            System.out.println("\nDate of Birth        : "+dob[id]);
                            System.out.println("\nMarks of Physics     : "+phy[id]);
                            System.out.println("\nMarks of Chemistry   : "+chem[id]);
                            System.out.println("\nMarks of Mathematics : "+maths[id]);
                            System.out.println("\nTotal Marks : "+total[id]+"/300\t Avergae Marks :"+average[id]);
                            System.out.println("\nPercentage : "+percent[id]);
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\n\n*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                            System.out.println("|                   Enter 1 to 'EXIT'                 |");
                            System.out.println("|                          OR                         |");
                            System.out.println("| Enter any number either than 1 to Run program again |");
                            System.out.println("*-----------------------------------------------------*");
                            m = Integer.parseInt(ob1.readLine());
                        }
                        if(m==1)
                        {
                            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                            System.out.println("|   'Thanks for giving your Precious Time'   |");
                            System.out.println("*--------------------------------------------*");
                            System.out.println("|                  EXITING.....              |");
                            System.out.println("*--------------------------------------------*");
                            break;
                        }
                        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                        System.out.println("|                      INVALID INPUT                    |");
                        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                        System.out.println("|                   Enter 1 to 'EXIT'                   |");
                        System.out.println("|                          OR                           |");
                        System.out.println("|   Enter any number either than 1 to Enter ID again    |");
                        System.out.println("*-------------------------------------------------------*");
                        m = Integer.parseInt(ob1.readLine());
                        if(m==1)
                        {
                            break;
                        }
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Edit Marks Selected : ");
                    for(j=1;j>0;j++)
                    {
                        System.out.println("Enter Student ID :");
                        id = Integer.parseInt(ob1.readLine());
                        if(id>100 && id<Last+102)
                        {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tBishop Westcott Boy's School");
                            System.out.println("\tNamkum, Ranchi '834004'");
                            System.out.println("\nMark Sheet of Student ID : "+id);
                            id -= 101;
                            System.out.println("\nName : "+name[id]+"\t Class : "+Class[id]);
                            System.out.println("\nAddress : "+address[id]);
                            System.out.println("\nDate of Birth        : "+dob[id]);
                            System.out.println("\nMarks of Physics     : "+phy[id]);
                            System.out.println("\nMarks of Chemistry   : "+chem[id]);
                            System.out.println("\nMarks of Mathematics : "+maths[id]);
                            System.out.println("-----------------------------------------------------");
                            for(j=1;j>0;j++)
                            {
                                System.out.print("\n\nEnter 1 to Edit Name          :");
                                System.out.print("\nEnter 2 to Edit Class           :");
                                System.out.print("\nEnter 3 to Edit Address         :");
                                System.out.print("\nEnter 4 to Edit Date of Birth   :");
                                System.out.print("\nEnter 5 to Edit Physics Marks   :");
                                System.out.print("\nEnter 6 to Edit Chemistry Marks :");
                                System.out.print("\nEnter 7 to Edit Maths Marks     :");
                                System.out.print("\nEnter 8 to EXIT                 :");
                                c = Integer.parseInt(ob1.readLine());
                                switch (c)
                                {
                                    case 1:
                                    {
                                        System.out.print("\nEnter New Name : ");
                                        name[id] = ob1.readLine();
                                        break;
                                    }
                                    case 2:
                                    {
                                        System.out.print("\nEnter Class : ");
                                        Class[id] = Integer.parseInt(ob1.readLine());
                                        break;
                                    }
                                    case 3:
                                    {
                                        System.out.print("\nEnter New Address : ");
                                        address[id] = ob1.readLine();
                                        break;
                                    }
                                    case 4:
                                    {
                                        System.out.print("\nEnter Date of Birth by using '/' afte day & , month :");
                                        dob[id] = ob1.readLine();
                                        break;
                                    }
                                    case 5:
                                    {
                                        System.out.print("\nEnter New Marks of Physics : ");
                                        phy[id] = Integer.parseInt(ob1.readLine());
                                        break;
                                    }
                                    case 6:
                                    {
                                        System.out.print("\nEnter New Marks of Chemistry : ");
                                        chem[id] = Integer.parseInt(ob1.readLine());
                                        break;
                                    }
                                    case 7:
                                    {
                                        System.out.print("\nEnter New Marks of Mathematics : ");
                                        maths[id] = Integer.parseInt(ob1.readLine());
                                        break;
                                    }
                                    case 8:
                                    {
                                        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                                        System.out.println("|   'Thanks for giving your Precious Time'   |");
                                        System.out.println("*--------------------------------------------*");
                                        System.out.println("|                  EXITING.....              |");
                                        System.out.println("*--------------------------------------------*");
                                        break;
                                    }
                                }
                                if(c==8)
                                {
                                    break;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                            System.out.println("|                      INVALID INPUT                    |");
                            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                            System.out.println("|                   Enter 1 to 'EXIT'                   |");
                            System.out.println("|                          OR                           |");
                            System.out.println("|   Enter any number either than 1 to Enter ID again    |");
                            System.out.println("*-------------------------------------------------------*");
                            m = Integer.parseInt(ob1.readLine());
                        }
                        if(m==1)
                        {
                            break;
                        }
                    }
                    break;
                }
                case 5:
                {
                    c = 0;
                    System.out.println("Student Profile Delete Selected :");
                    for(j=1;j>0;j++)
                    {
                        System.out.print("\nEnter Student ID to delete : ");
                        id = Integer.parseInt(ob1.readLine());
                        if(id>100 && id<Last+102)
                        {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tBishop Westcott Boy's School");
                            System.out.println("\tNamkum, Ranchi '834004'");
                            System.out.println("\nMark Sheet of Student ID : "+id);
                            id -= 101;
                            System.out.println("\nName : "+name[id]+"\t Class : "+Class[id]);
                            System.out.println("\nAddress : "+address[id]);
                            System.out.println("\nDate of Birth        : "+dob[id]);
                            System.out.println("\nMarks of Physics     : "+phy[id]);
                            System.out.println("\nMarks of Chemistry   : "+chem[id]);
                            System.out.println("\nMarks of Mathematics : "+maths[id]);
                            System.out.println("-----------------------------------------------------");
                            System.out.print("\n\nEnter 1 to confirm Delete or Enter 2 To Cancel : ");
                            c = Integer.parseInt(ob1.readLine());
                            switch (c)
                            {
                                case 1:
                                {
                                    for(k=id;k<Last;k++)
                                    {
                                        name    [k] = name[k+1];
                                        address [k] = address[k+1];
                                        Class   [k] = Class[k+1];
                                        dob     [k] = dob[k+1];
                                    }
                                    Last -= 1;
                                    System.out.println(id+101+" DELETED :\n");
                                    break;
                                }
                                case 2:
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
                        else
                        {
                            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                            System.out.println("|                      INVALID INPUT                    |");
                            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                            System.out.println("|                   Enter 1 to 'EXIT'                   |");
                            System.out.println("|                          OR                           |");
                            System.out.println("|   Enter any number either than 1 to Enter ID again    |");
                            System.out.println("*-------------------------------------------------------*");
                            m = Integer.parseInt(ob1.readLine());
                            if(m==1)
                            {
                                break;
                            }
                        }
                        if(c>0)
                        {
                            break;
                        }
                    }
                    break;
                }
                case 6:
                {
                        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                        System.out.println("|   'Thanks for giving your Precious Time'   |");
                        System.out.println("*--------------------------------------------*");
                        System.out.println("|                  EXITING.....              |");
                        System.out.println("*--------------------------------------------*");
                        break;
                }
            }
            if(n==6)
            {
                break;
            }
            System.out.println("\n\n\n\n");
        }
    }
}