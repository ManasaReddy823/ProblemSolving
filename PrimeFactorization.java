import java.util.Scanner;

public class PrimeFactorization {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("Given number is "+ input);
		
		int i=2;
		while(i<=Math.sqrt(input)) {
			if(input%i==0) {
				input=input/i;
				System.out.print(i+ " ");
			}
			else {
				i++;
			}
		}
		if(input>1) {
			System.out.println(input);
		}
		
	}

}
