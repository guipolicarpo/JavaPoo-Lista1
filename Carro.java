public class Carro {
    private String marca;
    Pneu dd;
    Pneu de;
    Pneu td;
    Pneu te;

    public Carro(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "[ " + marca + " - " + dd + " - " + de + " - " + td + " - " + te + " ]";
    }
}
