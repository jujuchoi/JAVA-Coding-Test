import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		while(N < 1 || N >1000000) {
			N = scanner.nextInt();
		}
//		int min = 1000000;
//		int max = -1000000;
//		for(int i = 0; i < N; i++) {
//			int x = scanner.nextInt();
//			if(x < min) {
//				min = x;
//			}
//			if(x > max) {
//				max = x;
//			}
//		}
//		System.out.println(min + " " + max);
		
		int[] list = new int[N];
		for(int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			while(x < -1000000 || x > 1000000) {
				x = scanner.nextInt();
			}
			
			list[i] = x;
		}
		Arrays.sort(list);
		System.out.println(list[0] + " " + list[N-1]);
		scanner.close();
	}
}
