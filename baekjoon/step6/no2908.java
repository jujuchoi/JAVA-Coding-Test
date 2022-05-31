import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int one = change(Integer.parseInt(st.nextToken()));
		int two = change(Integer.parseInt(st.nextToken()));
		if(one < two) {
			System.out.println(two);
		} else {
			System.out.println(one);
		}
		br.close();
	}
	static int change(int num) {
		int hun = num / 100;
		int ten = num / 10 % 10;
		int one = num % 10;
		int result = one*100 + ten*10 + hun;
		return result;
	}
}
