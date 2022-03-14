
import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("input is "+ input);
		
		if(input == 1) {
			System.out.println("neither prime nor composite");
			return;
		}
		
		for(int i=2;i<=Math.sqrt(input);i++) {
			if(input%i ==0) {
				System.out.println("not a prime number "+ input );
				return;
			}
		}
		
		System.out.println("is a prime number");
	}

}
