public class Pneu {
    private String marca;
    private int aro;
    private int altura;
    private int largura;


    public Pneu(String marca, int largura, int altura, int aro) {
        this.marca = marca;
        this.aro = aro;
        this.altura = altura;
        this.largura = largura;
    }


    @Override
    public String toString() {
        return "[ " + marca + " - " + aro + " - " + altura + " - " + largura + " ]";
    }
}
