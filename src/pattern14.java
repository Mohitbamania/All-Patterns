public class pattern14 {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.printf("%c",j+64+1);
            }
            System.out.print("\n");
        }
    }
}
