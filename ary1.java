import java.io.*;
class ary1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int i,j;
            int n[] = new int[5];
            for(i=0;i<5;i++)
            {
                System.out.print("Enter no : ");
                n[i] = Integer.parseInt(ob1.readLine());
                System.out.println();
            }
            for(i=0;i<5;i++)
            {
                System.out.println(n[i]);
            }
        }
    }
}