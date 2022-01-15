import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int temp = n;
        while(n>0){
            int r = n%10;
            result = result*10+r;
            n = n/10;
        }
        if(temp==result)
            System.out.println(temp+" is a palindrome");
        else
            System.out.println(temp+" is not a palindrome");

        
    }
    
}
