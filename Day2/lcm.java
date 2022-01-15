import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int lcm = 1;
        for(int i=1;i<=n && i<=m;i++) {
            if(n%i==0 && m%i==0) {
                lcm = lcm*i;
            }
        }
        System.out.println(lcm);
    }
    
    
}
