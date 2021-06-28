import java.util.Scanner;
public class usarNotebook {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        Notebook dell = new Notebook();
        dell.processador = "CORE I5";
        dell.memoria = 4;

        System.out.printf("Processador Dell: " + dell.processador);
        System.out.printf("\nMemória Ram Dell: " + dell.memoria);

        Notebook hp = new Notebook();
        hp.processador = "CORE I7";
        hp.memoria = 8;

        System.out.printf("\nProcessador HP: " + hp.processador);
        System.out.printf("\nMemória Ram HP: " + hp.memoria);
    }
}
