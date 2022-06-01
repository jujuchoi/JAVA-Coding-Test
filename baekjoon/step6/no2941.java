import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		String[] croatiaAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(String alpha : croatiaAlpha) {
			str = str.replace(alpha, "*");
		}
		System.out.println(str.length());
	}
}
