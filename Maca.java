public class Maca extends Fruta{
    String cor;

    public Maca() {
        super();
        cor = "vermelha";
    }

    public String morder() {
        return "maca mordida";
    }

    @Override
    public String toString() {
        return "[Maca: " + nome + ", cor: " + cor + "]";
    }
}
