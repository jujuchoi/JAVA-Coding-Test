import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		while(N < 0 || N > 99) {
			N = Integer.parseInt(br.readLine());
		}
		
		int result = -1;
		int cycle = 0;
				
		while(result != N) {
			int tol;
			if(cycle == 0) {
				if(N < 10) {
					tol = 0 + N;
					result = (10 * N) + tol;
					cycle++;
				} else {
					tol = (N / 10) + (N % 10);
					result = (N % 10) * 10 + (tol % 10);
					cycle++;
				}
			} else {
				tol = (result / 10) + (result % 10);
				result = (result % 10) * 10 + (tol % 10);
				cycle++;
			}
			
		}
		System.out.print(cycle);
		br.close();
	}
}
