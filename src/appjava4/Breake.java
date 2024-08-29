package appjava4;

public class Breake {

    public static void main(String[] args) {
        
        for (int i=0; i<10; i++){
            if (i == 3) {
                break;
            }
            System.out.println("Volta número: "+i);
        }
        System.out.println("Fim do programa!");
    }
}
