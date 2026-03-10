public class One_Dimensional_Array{
	public static void main(String[] args){
		int marks[] = {90,77,89,100,60,79,80,45,91,100};
		
		marks[3] = 81;
		
		System.out.printf("Element at index number 7 is %d",marks[7]);
		System.out.printf("%nElement at index number 3 is %d",marks[3]);
		
		System.out.println("%nThe eelements of the array is");
		for(int i = 0; i < 10; i++){
			System.out.printf("%d%n",marks[i]);
	}
}
}