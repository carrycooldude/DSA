import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        
        // for(int i=0;i<len;i++) {
        //     System.out.print(s.charAt(len-1-i));
        // }
        System.out.println(Reverse(s));
    }

    public static String Reverse(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++) {
            sb.append(s.charAt(len-1-i));
        }
        return sb.toString();
    }
}
