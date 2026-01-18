import java.util.*;
class Multipli_loop
{
    public static void main(String args[])
    {
        int i,a,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be multiplied :");
        a = sc.nextInt();
        System.out.println("");
        for(i=1;i<=10;i++)
        {
            m = a*i;
            System.out.println(a+"X"+i+"="+m);
        }
    }
}