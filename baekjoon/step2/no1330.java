import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		while(A < -10000 || A > 10000) {
			A = scanner.nextInt();
		}
		
		int B = scanner.nextInt();
		while(B < -10000 || B > 10000) {
			B = scanner.nextInt();
		}
		
		if(A > B) {
			System.out.println(">");
		} else if(A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
		scanner.close();
	}
}
