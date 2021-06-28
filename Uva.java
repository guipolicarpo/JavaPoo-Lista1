public class Uva extends Fruta{
    int quantidade;

    public Uva(){
        super();
        quantidade = 20;
    }

    @Override
    public String toString() {
        return "[Uva: " + nome + ", Quantidade: " + quantidade + "]";
    }
}
