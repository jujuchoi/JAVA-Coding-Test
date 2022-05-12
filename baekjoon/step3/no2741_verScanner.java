import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N < 1 || N > 100000) {
			N = sc.nextInt();
		}
		
		for(int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
