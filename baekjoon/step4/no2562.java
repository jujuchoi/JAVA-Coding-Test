import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int[] list = new int[9];
		int max = 1;
		int max_index = 0;
		for(int i = 0; i < 9; i++) {
			int x = scanner.nextInt();
			while(x < 1 || x > 100) {
				x = scanner.nextInt();
			}
//			list[i] = x;
			if(x > max) {
				max = x;
				max_index = i;
			}
		}
		System.out.println(max);
		System.out.println(max_index + 1);
		scanner.close();
	}
}
