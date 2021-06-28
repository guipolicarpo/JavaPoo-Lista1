import  java.util.Scanner;

public class Floresta {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Scanner lerStr = new Scanner (System.in);

        int opcao = 0, quantidade = 0;

        String nome = "", especie = "", cor = "";
        boolean frutifera = false, venenosa = false;

        Planta[] floresta = new Planta[1000];

        do{
            System.out.println("Menu Flotresta");
            System.out.println("1) Add Arvore");
            System.out.println("2) Add Flor");
            System.out.println("3) Add Planta Carnivora");
            System.out.println("4) Listar Plantas");
            System.out.println("5) Quantidade de plantas");
            System.out.println("6) Quantidade de plantas por tipo");
            System.out.println("7) Sair");
            System.out.printf("-> Opcao: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de Arvores");

                    System.out.printf("Nome: ");
                    nome = lerStr.nextLine();

                    System.out.printf("Especie: ");
                    especie = lerStr.nextLine();

                    System.out.println("Frutifera? [S/N]: ");
                    frutifera = lerStr.nextLine().equalsIgnoreCase("s");

                    floresta[quantidade++] = new Arvore(nome, especie, frutifera);


                    break;
                case 2:
                    System.out.println("Cadastro de Flores");

                    System.out.printf("Nome: ");
                    nome = lerStr.nextLine();

                    System.out.printf("Especie: ");
                    especie = lerStr.nextLine();

                    System.out.printf("Cor: ");
                    cor = lerStr.nextLine();

                    Flor flor = new Flor(nome, especie, cor);

                    floresta[quantidade++] = flor;

                    break;
                
                case 3:
                    System.out.println("Cadastro de Plantas Carnivoras");

                    System.out.printf("Nome: ");
                    nome = lerStr.nextLine();

                    System.out.printf("Especie: ");
                    especie = lerStr.nextLine();

                    System.out.println("Venenosa? [S/N]: ");
                    venenosa = lerStr.nextLine().equalsIgnoreCase("s");

                    floresta[quantidade++] = new Carnivora (nome, especie, venenosa);
                
                    break;

                case 4:
                
                    break;

                case 5:
                
                    break;

                case 6:

                    break;
            
                default:
                    System.out.println("Opcao Invalida!!!!");
                    break;
            }

        }while(opcao != 7);
    }
}
