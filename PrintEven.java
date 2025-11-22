import java.util.Scanner;
public class PrintEven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){

            if(i%2== 0){

                System.out.print(i + " ");

            }
        }

        System.out.println();

        int i = 1;

        while(i<=n){

            if(i%2== 0){

                System.out.print(i + " ");
                
            }

            i++;

        }

        System.out.println();

        int j = 1;

        do{

            if(j%2== 0){

                System.out.print(j + " ");
                
            }

            j++;
            
        }while (j<=n);

    }
}
