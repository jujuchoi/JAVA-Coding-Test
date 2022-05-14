import java.util.Scanner;

class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int A = checkNum();
		int B = checkNum();
		int C = checkNum();
		
		int tol = A * B * C;
		int[] number = new int[10];
		
		while(tol > 0) {
			int x = tol % 10;
			//System.out.println("tol: " + tol + " x: " + x);
			number[x]++;
			tol /= 10;
		}
		
		for(int j = 0; j < number.length; j++) {
			System.out.println(number[j]);
		}
	}
	
	private static int checkNum() {
		int N = scanner.nextInt();
		while(N < 100 || N >= 1000) {
			N = scanner.nextInt();
		}
		return N;
	}
}
