import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("nsd= " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int mod = a % b;
            a = b;
            b = mod;
        }
        return b;
    }
}
