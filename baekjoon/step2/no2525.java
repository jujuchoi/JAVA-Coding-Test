import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		while(A < 0 || A > 23) {
			A = scanner.nextInt();
		}
		
		int B = scanner.nextInt();
		while(B < 0 || B > 59) {
			B = scanner.nextInt();
		}
		
		int C = scanner.nextInt();
		while(C < 0 || C > 1000) {
			C = scanner.nextInt();
		}
		
		A += C / 60;
		B += C % 60;
		
		if(B >= 60) {
			A += 1;
			B -= 60;
		}
		
		if(A >= 24) {
			A -= 24;
		}
		
		System.out.printf("%d %d", A, B);

		scanner.close();
	}
}
