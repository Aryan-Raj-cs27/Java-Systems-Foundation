import java.util.*;
class SP_Revno
{
    int num,ans;
    
    SP_Revno()
    {
        num = 0;
        ans = 0;
    }
    
    void inputnum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
    }
    
    int reverse(int nn)
    {
        if(nn==0)
        return ans;
        else
        {
            ans = (ans*10)+(nn%10);
            return reverse(nn/10);
        }
    }
    
    void display()
    {
        System.out.println("Reverse of "+num+" is "+(reverse(num)));
    }
    
    public static void main(String args[])
    {
        SP_Revno obj = new SP_Revno();
        obj.inputnum();
        obj.display();
    }
}