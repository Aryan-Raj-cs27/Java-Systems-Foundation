import java.util.*;
class SP_Pronic
{
    int num;
    
    SP_Pronic()
    {
        num = 0;
    }
    
    void acceptnum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
    }
    
    boolean ispronic(int v)
    {
        for(int i=0;i<=(int)(Math.sqrt(v));i++)
        {
            if(v==i*(i+1))
            {
                return true;
            }
        }
        return false;
    }
    
    void check()
    {
        boolean f = ispronic(num);
        if(f==true)
        {
            System.out.println(num+" is a Pronic number ");
        }
        else
        {
            System.out.println(num+" is not a Pronic number ");
        }
    }
    public static void main (String args[])
    {
        SP_Pronic obj = new SP_Pronic();
        obj.acceptnum();
        obj.check();
    }
}