import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		while(N < 1 || N > 1000) {
			System.out.println("개수를 다시 입력해주세요.");
			N = Integer.parseInt(br.readLine());
		}
		
		int[] score = new int[N];
		int max = -1;
		double sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int x = Integer.parseInt(st.nextToken());
			
			score[i] = x;
			
			if(score[i] > max) {
				max = score[i];
			}
			sum += score[i];
			
//			int cnt = 0;
//			for(int j = 0; j < i; j++) {
//				if(score[j] == 0) {
//					cnt++;
//				} else {
//					cnt = 0;
//				}
//			}
//			if(cnt == N) {
//				System.out.println("점수를 다시 입력해주세요.");
//				st = new StringTokenizer(br.readLine());
//				i = 0;
//				max = 0;
//				sum = 0;
//			}
//			
//			while(x < 0 || x > 100) {
//				System.out.println("점수를 다시 입력해주세요.");
//				st = new StringTokenizer(br.readLine());
//				i = 0;
//				max = 0;
//				sum = 0;
//			}
		}
		
		System.out.println(((sum/max)*100)/N);
	}
}

