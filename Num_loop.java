import java.util.*;
class Num_loop
{
    public static void main(String args[])
    {
        int i,x,n=0,g=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit :");
        n = sc.nextInt();
        for(i=1;i<=4;i++)
        {
            g = g*10;
            x = n%10;
            g = g+x;
            n = (n-x)/10;
        }
        System.out.println("Number after loop is = "+g);
    }
}