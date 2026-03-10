import java.util.Scanner;

public class SwitchCase{
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your full name: ");
		String fullName = input.nextLine();
		
		System.out.print("Enter your course: ");
		String Course = input.nextLine();
		
		System.out.print("Enter your mark: ");
		short mark = input.nextShort();
		
		if(mark >= 0 && mark <= 100){
			switch(mark/10){
				case 0:
				case 1:
				case 2:
				case 3:
					System.out.printf("%s your mark is %d in %s %n Its Grade is F; you have Failed, but you are not a Failure",fullName,mark,Course);
				break;
				
				case 4:
					System.out.printf("%s your mark is %d in %s %n Its Grade is E; that's just Satisfactory",fullName,mark,Course);
				break;
				
				case 5:
					System.out.printf("%s your mark is %d in %s %n Its Grade is D; thats Average, you can always do better",fullName,mark,Course);
				break;
				
				case 6:
					System.out.printf("%s your mark is %d in %s %n Its Grade is C; that's Good",fullName,mark,Course);
				break;
				
				case 7:
					System.out.printf("%s your mark is %d in %s %n Its Grade is B; that's Excellent",fullName,mark,Course);
				break;
				
				case 8:
				case 9:
				case 10:
					System.out.printf("%s your mark is %d in %s %n Its Grade is A; that's Outstanding",fullName,mark,Course);
				break;
			}
		}
		else{
			System.out.println("Mark cannot be greater than 100");
		}
		
	}
}

Accept a Character and display if the character is a consonnat or a vowel
