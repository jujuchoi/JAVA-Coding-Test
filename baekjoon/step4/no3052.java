import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> list = new HashSet<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add(Integer.parseInt(br.readLine())%42);
		}
		System.out.println(list.size());
	}
	
}
