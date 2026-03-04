import java.util.Scanner;

public class EmployementSelection{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
		String fullName = scan.nextLine();
		
		System.out.print("Enter your English Score: ");
		int EScore = scan.nextInt();
		
		System.out.print("Enter your Maths Score: ");
		int MScore = scan.nextInt();
		
		System.out.print("Enter your ICT Score: ");
		int ItScore = scan.nextInt();
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		
		int Average = (EScore + MScore + ItScore)/3;
	   System.out.printf("the Average of the scores is %d%n",Average);
		
		if(EScore >= 70){
		
		if(Average >= 80){
			System.out.printf("%s we are glad to work with you. You qualified for the Job %n", fullName);
		}
		else{
			System.out.printf("Hello %s , we are sorry to say, but you didn't Qualify. Maybe Next time %n", fullName);
		}
		}
		else{
			System.out.println("And also, just so you know, Your English just didnt fit, Maybe you should go make it better");
		}
	}
}
			

