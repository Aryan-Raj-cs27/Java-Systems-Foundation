import java.io.*;

class ExceptionHandlingDemo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter a number:");
            int num = Integer.parseInt(br.readLine());
            System.out.println("You entered: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid integer.");
        } catch (IOException e) {
            System.out.println("An input error occurred: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
