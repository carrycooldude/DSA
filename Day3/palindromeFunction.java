import java.util.Scanner;

public class palindromeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int str = sc.nextInt();
        System.out.println("The number is " + (isPalindrome(str) ? "palindrome" : "not palindrome"));
    }

    static boolean isPalindrome(int n) {
        int rev=0;
        int temp=n;
        while(n>0)
        {
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(rev==temp)
            return true;
        else
            return false;


    }
    
}
