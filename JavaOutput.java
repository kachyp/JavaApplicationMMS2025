import java.util.Scanner;

public class JavaOutput{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	//Using the println method
	System.out.println("Hello World, /nThis is my first Java Program");
    System.out.println("Learning java is fun");
	
	//Using the print method
	System.out.print("Do you love \"learning Java\"? (Yes/No):");
	char reply = scan.next().charAt(0);
	
	System.out.print("Oh wow, I'm very glad you do.\n");
	
	System.out.print("What's your nickname pls: \n");
	String NickName = scan.nextLine();

	System.out.print("How old are you: ");
	int Age = scan.nextInt();
	
	
	//using the printf method
	System.out.printf("My name is %s, I am %d years old.",NickName,Age);
	}
}
