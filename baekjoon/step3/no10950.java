import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i = 1; i <= num; i++) {
			int A = scanner.nextInt();
			while(A < 0 || A > 10) {
				A = scanner.nextInt();
			}
			
			int B = scanner.nextInt();
			while(B < 0 || B > 10) {
				B = scanner.nextInt();
			}
			
			System.out.println(A + B);
		}
		scanner.close();
	}
}
