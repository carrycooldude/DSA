import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 153;
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println(temp + " is an Armstrong number");
        else
            System.out.println(temp + " is not an Armstrong number");
    }
    
}
