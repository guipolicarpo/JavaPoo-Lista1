public class Celular {
    String marca;
    String modelo;
    double preco;
    boolean novo;
    String ligacao;

    public Celular (){
        
    }

    void fazerLigacao(String telefone) {
        System.out.println("Ligando para: " + telefone);
    }
}
