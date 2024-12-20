public class pattern5 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
            for (int k = 0; k < 4; k++) {
                for (int l = 4; l > k; l--) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
    }
}