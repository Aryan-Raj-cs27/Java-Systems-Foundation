import java.io.*;
class ary_Greater_No
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int i,j=0;
            int n[] = new int[10];
            for(i=0;i<10;i++)
            {
                System.out.print("\nEnter Number : ");
                n[i] = Integer.parseInt(ob1.readLine());
                if(n[i]>n[j])
                {
                    j = i;
                }
            }
            System.out.println("\nGreatest Number is : "+n[j]);
        }
    }
}