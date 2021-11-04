import java.util.Scanner;

public class Z4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(phi(a));
    }

    public static int phi(int m) {
        int n = 2;
        int k = m;
        while (n*n <= m) {
            if (m % n == 0) {
                while(m%n==0){
                    m/=n;
                }
                k-=k/n;
            }
            else {
                n++;
            }
        }
        if (m>1){
            k-=k/m;
        }
        return k;

    }
}