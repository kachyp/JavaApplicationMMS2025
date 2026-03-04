public class UserDefineMethod{
	public static String userName(String name){
		
		return name;
	}
	
	public static int checkAge(int age){
		if(age >= 18){
			System.out.println(UserDefineMethod.userName("John Wick ") + "You are an Adult");
		}
		else{
			System.out.println(UserDefineMethod.userName("John Wick ") + "You are a Minor");
		}
		return age;
	}
	
	public static void main(String[] args){
		System.out.println(UserDefineMethod.checkAge(25));
	}
}
