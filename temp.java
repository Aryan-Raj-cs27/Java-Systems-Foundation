import java.util.*;
class temp
{
    public static void main(String args[]) 
    {
        String nm;
        int n,c,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        n = sc.nextInt();
        System.out.println("Enter the unit 'C' for celsius or 'F' for fahrenheit:");
        nm = sc.next();
        if(nm.charAt(0)=='c'||nm.charAt(0)=='C')
        {
            f = (n*(9/5))+32;
            System.out.println("Temperature in fahrenheit is "+f+" F ");
        }                   
        else if(nm.charAt(0)=='f'||nm.charAt(0)=='F')
        {
            c = (n-32)*(5/9);
            System.out.println("Temperature in celsius is "+c+" C ");
        }
        else
        {
            System.out.println("Input is invalid");
        }
    }
}