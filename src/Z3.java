import java.util.ArrayList;
import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("inverse el = "+inverse_element(a, n));
    }

    public static int inverse_element(int a, int n) {
        int sn = n;
        int i = 1;
        while ((n % a != 0)) {
            n = sn * i++ + 1;
        }
        return n / a;
    }
}
