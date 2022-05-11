import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = 0;
        int B = 0;
        
        A = sc.nextInt();
        B = sc.nextInt();
        
        if(0<=A && B <= 10000) {
            System.out.println(A+B);
            System.out.println(A-B);
            System.out.println(A*B);
            System.out.println(A/B);
            System.out.println(A%B);
            
        }
        
        sc.close();
    }

}
