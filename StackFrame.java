public class StackFrame{
	public static void main(String[]args){
		StackFrame sf = new StackFrame();
		
		sf.checksum();
	}
	
	public static add(){
		int x= 5;
		int y = 25;
		int sum = x + y;
		System.out.printf("The sum is %d",sum);
	}
	
	public void checksum(){
		if(StackFrame.add() >= 15){
			System.out.println("Sum is greater than 15");
		}
		else{
			System.out.println("Sum is not greater than 15");
		}
	}
}