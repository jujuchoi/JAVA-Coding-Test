import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		while(x%100 == 0) {
			x = scanner.nextInt();
		}
		
		int y = scanner.nextInt();
		while(y%100 == 0) {
			y = scanner.nextInt();
		}
		
		int result;
		result = x * (y % 10);
		System.out.println(result);
		
		result = x * ((y % 100) / 10);
		System.out.println(result);
		
		result = x * (y / 100);
		System.out.println(result);
		
		System.out.println(x * y);
		
		scanner.close();
	}
}
