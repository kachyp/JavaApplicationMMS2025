import java.util.Scanner;

public class ConsonantVowelID{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What's your name: ");
		String fullName = scan.nextLine();
				
		System.out.print("Enter any Alphabet: ");
		char Alpha = scan.next().charAt(0);
		
		if (Alpha == 'A'||'B'||'C'||'D'||'E'){
			switch (Alpha){
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.printf("%c is a Vowel",Alpha);
				break;
			}
		}
		else{
			System.out.println("It has to be a Consonant");
		}
	}
}


