package mypack;
import java.util.*;

public class as1 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		
		if (a == 0)
			System.out.println("Zero");
		else if (a < 0) 
			System.out.println("Negative");
		else 
			System.out.println("Positive");
		sc.close();
		
		
	}

}

	