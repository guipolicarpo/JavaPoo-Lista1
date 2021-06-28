import java.util.Scanner;

public class metodo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, soma;

        System.out.printf("Digite o valor 1: ");
        n1 = ler.nextInt();

        System.out.printf("Digite o valor 2: ");
        n2 = ler.nextInt();

        System.out.println("A soma dos numeros e: " + soma(n1, n2) );

    }

    static int soma(int numero1, int numero2){
        return numero1 + numero2;
    }
}