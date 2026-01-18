import java.util.*;
class Pattern_5
{
    void P5()
    {
        int i,j=1,x=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                x++;
                System.out.print(x);
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern_5 obj = new Pattern_5();
        obj.P5();
    }
}