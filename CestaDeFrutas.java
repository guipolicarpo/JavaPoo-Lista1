import java.util.Scanner;

public class CestaDeFrutas {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Scanner lerStr = new Scanner (System.in);
        
        int opcao;
        int tamanho = 100, contador = 0;
        Fruta[] cesta = new Fruta[tamanho];

        do {   
            System.out.println("1) Add Maca");
            System.out.println("2) Add Pera");
            System.out.println("3) Add Uva");
            System.out.println("4) Cesta");
            System.out.println("5) Sair");
            System.out.printf(">>> Opcao: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    cesta[contador] = new Maca();
                    System.out.printf("Nome da maca: ");
                    cesta[contador].nome = lerStr.nextLine();
                    System.out.printf("Cor da maca: ");
                    ((Maca)cesta[contador]).cor = lerStr.nextLine();
                    contador++;
                    break;

                case 2:
                    Pera pera = new Pera();
                    System.out.printf("Nome da pera: ");
                    pera.nome = lerStr.nextLine();
                    System.out.printf("Pera madura [s/n]: ");
                    pera.madura = lerStr.nextLine().equalsIgnoreCase("s");
                    cesta[contador] = pera;
                    contador++;
                    break;

                case 3:
                    Uva uva = new Uva();
                    System.out.printf("Nome da uva: ");
                    uva.nome = lerStr.nextLine();
                    System.out.printf("Quantidade: ");
                    uva.quantidade = ler.nextInt();
                    cesta[contador] = uva;
                    contador++;
                    break;

                case 4: 
                    for(int i = 0; i < contador; i++){
                        System.out.println(cesta[i]);
                    }
                    break;

                case 5:

                    break;
            
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }

        } while (opcao != 5);

    }
}
