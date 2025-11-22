import java.util.Scanner;
public class Fifth {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arm of triangle : ");
        double arm = sc.nextDouble();

        double area = (Math.sqrt(3)/4)*arm*arm;

        System.out.println(area);

    }
}
