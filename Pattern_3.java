import java.util.*;
class Pattern_3
{
    void P3()
    {
        int i,j;
        for (i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern_3 obj = new Pattern_3();
        obj.P3();
    }
}