import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		while(year < 1000 || year > 3000) {
			year = scanner.nextInt();
		}
		System.out.println(year - 543);
	}
}
