public class pattern21 {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=5; k>=1; k--){
                System.out.print(k + " ");
            }
            System.out.print("\n");
        }
    }
}
