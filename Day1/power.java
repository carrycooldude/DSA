import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // taking inputs
        int n = sc.nextInt();
        int m = sc.nextInt();
        int base = m;
        int exponent = n;
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(result);
    }

}
