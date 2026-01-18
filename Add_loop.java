import java.util.*;
class Add_loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,i,s=0;
        System.out.println("Enter the numbers & Enter 0 to Stop;");
        for(i=1;i>=0;i++)
        {
            a = sc.nextInt();
            if(a==0)
            {
                break;
            }
            s = s+a;
        }
        System.out.println(s);
    }
}