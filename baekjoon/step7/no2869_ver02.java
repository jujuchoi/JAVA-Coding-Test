import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		br.close();
        double A = Integer.parseInt(str[0]);
        double B = Integer.parseInt(str[1]);
        double V = Integer.parseInt(str[2]);
		
        int day = 1;
        V -= A;
        day += V/(A-B);
        if(V %(A-B)>0){
            day++;
        }
		System.out.println(day);			
	}
}
