import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N < 1 || N > 100000) {
			N = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if( A < 0 || A > 10 || B < 0 || B > 10 ) {
				st = new StringTokenizer(br.readLine());
				A = Integer.parseInt(st.nextToken());
				B = Integer.parseInt(st.nextToken());
			}
			int result = A + B;
			bw.write("Case #"+ i + ": " + A + " + " + B + " = " + result + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
