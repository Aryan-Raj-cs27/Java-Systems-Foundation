import java.util.Scanner;
public class Smith 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sumDigits = 0;
        int sumPrimeFactors = 0;

        int temp = num;
        while (temp > 0) 
        {
            sumDigits += temp % 10;
            temp = temp / 10;
        }

        int i = 2;
        while (num > 1) 
        {
            while (num % i == 0) 
            {
                int factor = i;
                while (factor > 0) 
                {
                    sumPrimeFactors += factor % 10;
                    factor = factor / 10;
                }
                num = num / i;
            }
            i++;
        }

        if (sumDigits == sumPrimeFactors) 
        {
            System.out.println(originalNum + " is a Smith number.");
        } else 
        {
            System.out.println(originalNum + " is not a Smith number.");
        }
    }
}
