import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for how many lines:");
        int a = sc.nextInt();

        for(int i=0; i<a; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
