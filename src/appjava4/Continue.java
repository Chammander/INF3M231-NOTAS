package appjava4;

public class Continue {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            if (i % 2 != 0)continue;
                System.out.println("Volta número: "+i);
        }
        System.out.println("Fim do programa!");

    }

}
