import java.util.Scanner;

public class palindrome4 {
	
	public static void main(String[] args) {
		//1. The palindrome number is something its reverse is same as that number
		//2. So reverse the number & compare with original
		//3. Reverse a number code is already written 
		
		// Procedure
		// Step 1: collect a number there are two ways 
		//			a. Directly giving the number with int
		//			b. Collecting from scanner class --> lets opt this
		
		// How to use Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		// now store the input in to a int variable
		int num = sc.nextInt();
		//check weather you got the correct number or not
		System.out.println(num);
		
		//Step 2: Now need to reverse the number we had
		//		a. Take a temporary variable
		// 		b. Extract one one number from the back and keep it reverse number
		// 		c. took a tmp variable else original num is becoming zero
		
		int rev=0;
		int tmp = num;
		
		while(tmp>0) {
			// To extract a single number from a number. 
			// This % will extract the last number
			rev = (rev*10) + tmp%10;
			// Now remove the last number from the number 
			// That can be done by / operator
			tmp = tmp/10;
			
		}
		
		System.out.println(rev);
		System.out.println(num);
		
		if(num == rev) {
			System.out.println("Is palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
	}

}
