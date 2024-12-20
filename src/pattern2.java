import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for how many lines:");
        int a = sc.nextInt();

        for(int i=0; i<a; i++){
            for(int j=a; j>i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
