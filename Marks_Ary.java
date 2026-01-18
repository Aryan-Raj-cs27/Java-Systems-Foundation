import java.io.*;
class Marks_Ary
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        String name[] = new String[5];
        int marks [][] = new int[5][3];   
        String sub[] = new String[3];
        int total,avg,i,j,k,l;
        for(i=0;i<3;i++)
        {
            System.out.print("Enter Subject "+(i+1)+" : ");
            sub [i] = ob1.readLine();
        }
        for(i=0;i<5;i++)
        {
            System.out.print("Enter Name "+(i+1)+" : ");
            name[i] = ob1.readLine();
            for(j=0;j<3;j++)
            {
                System.out.print("Enter Marks of "+sub[j]+" : ");
                marks[i][j] = Integer.parseInt(ob1.readLine());
            }
        }
        System.out.println("\nName\tPhy\tChem\tMath\tTotal\tAverage");
        for(i=0;i<5;i++)
        {
            total = 0;
            avg = 0;
            System.out.print(name[i]+"\t");
            for(j=0;j<3;j++)
            {
                System.out.print(marks[i][j]+"\t");
                total += marks[i][j];
            }
            avg = total/3;
            System.out.print(total+"\t"+avg+"\n");
        }
    }
}