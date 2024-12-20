public class pattern15 {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.printf("%c",i+64+1);
            }
            System.out.print("\n");
        }
    }
}
