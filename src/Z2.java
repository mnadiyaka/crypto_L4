import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcdex(a,b);
    }
    public static int[] gcdex(int a, int b){
        int x1 = 1, x2 = 0;
        int y1 = 0, y2 = 1;
        int sb  = b;
        while(b != 0) {
            int quotient = a / b;
            int r = a %b;
            a = b;
            b = r;
            int tempS = x1 - x2 * quotient;
            x1 = x2;
            x2 = tempS;
            int tempR = y1 - y2 * quotient;
            y1 = y2;
            y2 = tempR;
        }
        System.out.println("nsd = " +a + "; x = " + x1 + "; y = " + y1);
        System.out.println(a + "*"+ x1 + "+"+sb+"*"+y1+"="+a);
        return new int[]{a,x1,y1};
    }
}
