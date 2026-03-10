import java.util.Scanner;


public class One_Dimensional_Array2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int marks[] = new int[10];
		int counter = 1;
		
		for(int i = 0; i < 10; i++){
			System.out.printf("Enter element %d: ",counter);
			
			marks[i] = scan.nextInt();
			
			counter++;
		}
		
		for(int i = 0; i < 99; i++){
			System.out.printf("The marks are %d,",counter);
			counter+=5;
		}
		
	}
	
}