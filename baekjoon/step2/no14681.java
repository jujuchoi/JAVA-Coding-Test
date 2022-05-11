import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		while(x < -1000 || x > 1000) {
			x = scanner.nextInt();
		}
		
		int y = scanner.nextInt();
		while(y < -1000 || y > 1000) {
			y = scanner.nextInt();
		}
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		} else if(x > 0 && y < 0) {
			System.out.println("4");
		} else if(x < 0 && y > 0) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
		
		scanner.close();
	}
}
