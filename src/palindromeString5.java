import java.util.Scanner;

public class palindromeString5 {
	public static void main(String[] args) {
		//Palindrome String is nothing but reverse of that string is same or not
		//1. First collect a Sting Using Scanner class
		//1.1 Before reversing the string 
		//		a. Store the string in Tmp variable
		//		b. Save the length of the string
		//2. Reverse that string
		//3. Check the reverse string is same as original
		
		//1. First collect the String using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		
		String str_org = sc.next();
		System.out.println(str_org);
		
		//1.1 Before reversing the string 
		//		a. Store the string in Tmp variable
		//		b. Save the length of the string
		String tmpString = str_org;
		int len_str = str_org.length();
		System.out.println(tmpString+len_str);
		
		//2. Reverse the string
		//  a. Create a empty string
		//	b. to reverse a string need to get each char from the string from the last
		//  c. Append that character to the reverse string
		
		String revString ="";
		
		for(int i=len_str-1; i>=0; i--) {
			revString =  revString+tmpString.charAt(i);
		}
		System.out.println(revString);
		
		if (revString.equals(str_org)) {
			System.out.println("palindrome String");
		}
		else {
			System.out.println("not palindrome string");
		}
	}

}
