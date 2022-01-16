import java.util.Scanner;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class MaxMin {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("The maximum number is: " + max(a, b, c));
        System.out.println("The minimum number is: " + min(a, b, c));
    }

    public static int min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    
}
    

    
    