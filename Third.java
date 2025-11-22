import java .util.Scanner;
public class Third{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius : ");

        double radius = sc.nextDouble();

        float PI = 3.1416F;

        double area = PI * radius * radius;
        
        System.out.println("Area of the circle : " + area);

    }
}