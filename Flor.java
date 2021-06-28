public class Flor extends Planta{

    private String cor;

    public Flor(String nome, String especie, String cor) {
        super(nome, especie);
        setCor("branca");
        setCor(cor);
    }

    private void setFlor(String nome, String especie, String cor){
        setCor (cor);
    }

    public void setCor( String cor){
        if (! cor.isEmpty()) {
            this.cor = cor;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
