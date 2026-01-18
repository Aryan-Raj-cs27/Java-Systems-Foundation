import java.io.*;
class ary_details
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int i;
            String nm[] = new String[5];
            String ad[] = new String[5];
            int sal[] = new int[5];
            for(i=0;i<5;i++)
            {
                System.out.println("");
                System.out.print("Enter name of "+(i+1)+" Employe : ");
                nm[i] = ob1.readLine();
                System.out.print("\nEnter address of "+nm[i]+" : ");
                ad[i] = ob1.readLine();
                System.out.print("\nEnter salary of "+nm[i]+" : ");
                sal[i] = Integer.parseInt(ob1.readLine()); 
            }
            for(i=0;i<5;i++)
            {
                System.out.println("");
                System.out.println("\n("+(i+1)+".)");
                System.out.println("");
                System.out.print("Name : "+nm[i]);
                System.out.print("\naddress :"+ad[i]);
                System.out.print("\nsalary :"+sal[i]);
            }
        }
    }
}