import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		while(N < 1 || N > 100) {
			N = Integer.parseInt(br.readLine());
		}
		String number = br.readLine();
		for(int i = 0; i < N; i++) {
			sum += Integer.parseInt(number.substring(i, i+1));
		}
		System.out.println(sum);
        br.close();
	}
}
