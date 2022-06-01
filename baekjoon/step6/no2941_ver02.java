import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		String[] croatiaAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int n = croatiaAlpha.length;
		for(int i = 0; i < n; i++) {
			str = str.replace(croatiaAlpha[i], "*");
		}
		System.out.println(str.length());
	}
}
