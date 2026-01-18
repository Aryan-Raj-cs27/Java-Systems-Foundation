import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int n = sc.nextInt();
System.out.print("Enter a string: ");  
String str= sc.nextLine();              //reads string   
System.out.print(n+"\nYou have entered: "+str);             
}  
}  