import java.util.*;
class Pattern_2
{
    void P2()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            if(i==5)
            {
                for(i=4;i>=1;i--)
                {
                    for(j=1;j<=i;j++)
                    {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
    public static void main(String args[])
    {
        Pattern_2 obj = new Pattern_2();
        obj.P2();
    }
}