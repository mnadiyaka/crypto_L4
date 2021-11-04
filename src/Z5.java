import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = sc.nextInt();

        System.out.println("inv= " + inverse_element_2(a, p));
    }

    public static int inverse_element_2(int a, int p){
        int el = Z4.phi(p)-1;
        int step = (int)(Math.pow(a, el));
        int inv = step%p;
        return inv;
    }
}
