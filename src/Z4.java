import java.util.Scanner;

public class Z4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(phi(a));
    }

    public static int phi(int m) {
        int n = 2;
        int k = 0;
        while (n <= m) {
            if (m % n > 0) {
                k++;
            }
            n++;
        }
        return k;

    }
}