import java.util.*;
class Pattern_8
{
    void P8()
    {
        int i,j,a,b,c,d,e,f,r,g,h,x=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==j)
                {
                    System.out.print("1");   
                    
                }  
                else
                {                    
                    System.out.print("0");
                    
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern_8 obj = new Pattern_8();
        obj.P8();
    }
}