import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N < 1 || N > 100000) {
			N = Integer.parseInt(br.readLine());
		}
		
		for(int i = N; i >= 1; i--) {
			bw.write(i+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
