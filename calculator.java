import java.util.Scanner;
public class calculator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("enter symbol : ");
        char ch = sc.next().charAt(0);

        switch(ch) {

            case '+' : 

                System.out.println(x+y);

                break;

            case '-' : 

                System.out.println(x-y);

                break;

            case '*' : 

                System.out.println(x*y);

                break;

            case '/' : 

                System.out.println(x/y);

                break;

            default:

            System.out.println("invalid");

        }

    }
}
