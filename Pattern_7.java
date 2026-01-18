import java.util.*;
class Pattern_7
{
    void P7()
    {
        int i,j,x,y=5,a=0;
        for(i=1;i<=5;i++)
        {
            for(x=1;x<y;x++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                a++;
                System.out.print(a+" ");
               // System.out.print(" ");
            }
            System.out.println();
            y = y-2;
            i++;
        }
    }
    public static void main(String args[])
    {
        Pattern_7 obj = new Pattern_7();
        obj.P7();
    }
}