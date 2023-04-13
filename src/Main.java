public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // laço enquanto - while
        int contador = 0;
        while(contador < 10) {
            // processos
            System.out.println("Contador = " + contador);
            contador = contador + 1; //incremento
        }
        // laço faça enquanto - do while
        int cont = 1;
        do {
            System.out.println(cont);
            cont++; //incremento
        }while(cont <= 10);

        // laço para faça for
        for(int x=0; x<10; x++){
            System.out.println(x);
        }
    }
}

