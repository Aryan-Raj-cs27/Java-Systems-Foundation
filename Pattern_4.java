import java.util.*;
class Pattern_4
{
    void P4()
    {
        int i,j;
        for (i=1;i<=5;i++)
        {
            System.out.print(i);
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern_4 obj = new Pattern_4();
        obj.P4();
    }
}