import java.util.Scanner;
public class ArrayExceptionHandling 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 integers for the array:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter an index to access: ");
        int index = sc.nextInt();
        try 
        {
            System.out.println("Element at index "+index+": "+arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
             System.out.println("Error: Index " + index + " is out of bounds for the array.");
        }
        finally 
        {
            sc.close();
        }
    }
}