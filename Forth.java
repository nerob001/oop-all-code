import java.util.Scanner;
public class Forth {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celsius temperature : ");
        double C = sc.nextDouble();

        double F = ((9.0/5)*C)+32;

        System.out.println(F);

    }
}
