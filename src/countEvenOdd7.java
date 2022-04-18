import java.util.Scanner;

public class countEvenOdd7 {

	public static void main(String[] args) {
		// This program is to count Even and Odd numbers in a given Number
		// 1.Remove one by one numbers from the given number 
		// 2.verify the number is even or odd and increment the counter
		
		// First collect number from scanner class 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		System.out.println(num);
		int tmp;
		int evenCount=0;
		int oddCount=0;
		int zeroCount=0;
		// Now While the number greater than 0
		// Extract one by one digit from the number
		while(num>0) {
			tmp = num%10;
			if(tmp ==0) {
				zeroCount++;
			}
			else if(tmp%2 == 0) {
				evenCount=evenCount+1;
			}
			else if (tmp%2 != 0) {
				oddCount=oddCount+1;
			} 
			num=num/10;
		}
		
		System.out.println("EvenCount = "+evenCount);
		System.out.println("oddCount = "+oddCount);
		System.out.println("Zeros = "+zeroCount);
	}
}
