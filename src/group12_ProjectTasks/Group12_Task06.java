package group12_ProjectTasks;

public class Group12_Task06 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not
		 */

		
		int num = 19;
		int nums = 0; 
		
		for (int i = 2; i<=num/2; i++) {
			if(num%i==0){
				nums = nums + 1;
				
			}
		}
	
			if (nums==0) {
				System.out.println("Number is prime");
			}else 
				System.out.println("number is not prime");
		
		
		
		
		
		
		
		
	}
}
