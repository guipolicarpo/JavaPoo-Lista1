import java.util.Scanner;
public class usaCasa {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Scanner lerStr = new Scanner (System.in);
        Casa casa = new Casa();

        int opc, porta;

        do{
            System.out.println(casa);

            System.out.printf("\nQual opcao deseja?");
            System.out.printf("\n[1] Abrir porta, [2] Fechar porta, [3] Pintar casa, [4] Quantas portas estao abertas e [5] Sair: ");
            opc = ler.nextInt();

            if(opc == 1){
                System.out.printf("Qual porta deseja abrir? [1] Porta 1, [2] Porta 2 e [3] Porta 3: ");
                porta = ler.nextInt();

                if(porta == 1){
                    if(casa.getPorta1() == false){
                        casa.setAbrirPorta1(true);
                    }
                    else{
                        System.out.println("\nA porta 1 já esta aberta!");
                    }
                }

                if(porta == 2){
                    if(casa.getPorta2() == false){
                        casa.setAbrirPorta2(true);
                    }
                    else{
                        System.out.println("\nA porta 2 já esta aberta!");
                    }
                }

                if(porta == 3){
                    if(casa.getPorta3() == false){
                        casa.setAbrirPorta3(true);
                    }
                    else{
                        System.out.println("\nA porta 3 já esta aberta!");
                    }
                }                         
            }

            if (opc == 2) {
                System.out.printf("Qual porta deseja fechar? [1] Porta 1, [2] Porta 2 e [3] Porta 3: ");
                porta = ler.nextInt();

                if(porta == 1){
                    if(casa.getPorta1() == true){
                        casa.setFecharPorta1(false);
                    }
                    else{
                        System.out.println("\nA porta 1 já esta fechada");
                    }
                }

                if(porta == 2){
                    if(casa.getPorta2() == true){
                        casa.setFecharPorta2(false);
                    }
                    else{
                        System.out.println("\nA porta 2 já esta fechada");
                    }
                }

                if(porta == 3){
                    if(casa.getPorta3() == true){
                        casa.setFecharPorta3(false);
                    }
                    else{
                        System.out.println("\nA porta 3 já esta fechada");
                    }
                }
            }

            if (opc == 3){
                System.out.print("Qual cor deseja pintar a casa: ");
                casa.setPintarCasa(lerStr.nextLine());
                System.out.println("A casa foi pintada!");
            }

            if (opc == 4){
               System.out.println("\nO numero de portas abertas e " + casa.getPortasAbertas());
            }

        }while(opc != 5);

        
    }
}
