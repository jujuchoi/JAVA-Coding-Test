import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] score = new int[N];
			double avg = 0;
			for(int j = 0; j < N; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				avg += score[j];
			}
			avg /= N;
			int cnt = 0;
			for(int j = 0; j < N; j++) {
				if(score[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%s\n", (float)cnt/N*100, "%");
		}
	}
}
