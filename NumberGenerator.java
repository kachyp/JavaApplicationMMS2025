import java.util.Random;
import java.util.Scanner;

public class NumberGenerator{
	public static void main(String[] args){
		Random rand = new Random();
		//any integer
		System.out.println(rand.nextInt());
		//Generate a random within a given rangee
		System.out.println(rand.nextInt(20)+8+2);
		
		//Generate a random including the intermetent decimals
		System.out.println(rand.nextDouble());
		
		//Generate a random including the intermetent decimals within a given rangee
		System.out.println(rand.nextInt(3));
		
		//Generate any boolean
		System.out.println(rand.nextBoolean());
		
	}
}		