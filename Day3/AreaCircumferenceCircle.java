import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 
public class AreaCircumferenceCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area is "+area(radius)+" and circumference is "+circumference(radius));

        
    }
    static double area(double radius) {
        return 3.14 * radius * radius;
    }
    static double circumference(double radius) {
        return 2 * 3.14 * radius;
    }
    
}
