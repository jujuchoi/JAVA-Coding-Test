import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		Main m = new Main();
		for(int i = 1; i <= n; i++) {
			if(m.x(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
        br.close();
    }
    
    private boolean x(int n) {
		if(n < 100) {
			return true;
		}
		if(n == 1000) {
			return false;
		}
		int a = n/100;
		int b = (n/10)%10;
		int c = n%10;
		if(a-b == b-c) {
			return true;
		}
		return false;
	}
}
    
