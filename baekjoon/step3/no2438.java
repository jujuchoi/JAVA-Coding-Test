import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N < 1 || N > 100) {
			N = Integer.parseInt(br.readLine());
		}
		String star = "";
		for(int i = 0; i < N; i++) {
			star += "*";
			bw.write(star + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
