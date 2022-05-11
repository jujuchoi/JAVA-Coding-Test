import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A=0, B=0, C=0;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        if(2<=A && A<=10000 && 2<=B && B<=10000 && 2<=C && C<=10000) {
            System.out.println((A+B)%C);
            System.out.println(((A%C) + (B%C))%C);
            System.out.println((A*B)%C);
            System.out.println(((A%C) * (B%C))%C);
        }
        
        sc.close();
    }
}
