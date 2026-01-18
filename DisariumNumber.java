import java.util.Scanner;
public class DisariumNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, rem = 0, n;
        int len = 0,nm = num;
        while (nm != 0) 
        {
            len++;
            nm = nm / 10;
        }
        n = num;
        while (num > 0) 
        {
            rem = num % 10;
            sum = sum + (int) Math.pow(rem, len);
            num = num / 10;
            len--;
        }
        if (sum == n) 
        {
            System.out.println(n + " is a Disarium number.");
        } else 
        {
            System.out.println(n + " is not a Disarium number.");
        }
    }
}
