import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		while(n < 1 || n > 10000) {
			n = scanner.nextInt();
		}
		int result = 0;
		for(int i = n; i >= 1; i--) {
			result += i;
		}
		System.out.println(result);
		scanner.close();
	}
}
