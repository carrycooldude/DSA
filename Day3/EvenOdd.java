// Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The number is " + (num % 2 == 0 ? "even" : "odd"));

    }
    
}
