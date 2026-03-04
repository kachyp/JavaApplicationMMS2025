public class EvenDesc{
	public static void main(String[] args){
		for(int i = 100;  i >= -100;  i--){
			if(i % 2 == 0){
				System.out.printf("%d is an even number%n",i);
			}
		}
	}
}