public class pattern12 {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            for(int j=4; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            for(int l=0; l<i; l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=4; k>i; k--){
                System.out.print("*");
            }
            for(int l=3; l>i; l--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
