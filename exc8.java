//Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class exc8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int num1, num2;

        System.out.printf("Digite o valor 1: ");
        num1 = ler.nextInt();

        System.out.printf("Digite o valor 2: ");
        num2 = ler.nextInt();

        System.out.println("O maior é: " + isMaior(num1, num2));
    }

    static int isMaior (int num1, int num2){
        return Math.max(num1, num2);
    }
}