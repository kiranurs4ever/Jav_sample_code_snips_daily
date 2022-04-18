import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class countNumberOfDigits6 {
	public static void main(String[] args) {
	
		// Count Number of Digits means a number will be there we need to count the number of digits in that Number
		// 1. Get the number from user through scanner class
		// 2. count each digit in that number 
		//		By removing one one number from it and incrementing the count 
		// 3. Display the count
		
		// 1. Get the number from user through scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(num);
		
		// 2. count each digit in that number 
		//		By removing one one number from it and incrementing the count 
		//      a. create a counter variable
		
		int count=0;
		
		while (num>0) {
			num=num/10;
			count++;
		}
		
		//3. Display the count
		System.out.println("Count:"+count);
		
		//  "I dont know how to show if the preceding numbers are zeros"
		
	}
}
