import java.util.Scanner;

public class Second {
    
    public static void main(String[] args) {
        
        Scanner sc = new 
        Scanner(System.in);

        System.out.print("Enter a radius : ");
        double radius = sc.nextDouble();

        double PI = 3.1416;

        double volume = 4.0/3* PI * radius * radius * radius;

        System.out.println("volume is : " + volume);


    }
}
