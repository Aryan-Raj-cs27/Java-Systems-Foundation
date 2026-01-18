import java.lang.*;
import java.util.*;
class Pattern_1
{
    void P1()
    {
        int i,j;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern_1 obj = new Pattern_1();
        obj.P1();
    }
}