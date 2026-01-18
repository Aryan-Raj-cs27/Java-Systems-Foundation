import java.util.*;
class Pattern_6
{
    void P6()
    {
        int i,j,x,y=5;
        for(i=1;i<=5;i++)
        {
            for(x=1;x<y;x++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");            
            }
            System.out.println();
            y--;
        }
    }
    public static void main(String args[])
    {
        Pattern_6 obj = new Pattern_6();
        obj.P6();
    }
}