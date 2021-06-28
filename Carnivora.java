public class Carnivora extends Planta{

    private boolean venenosa;

    public Carnivora(String nome, String especie, boolean venenosa) {
        super(nome, especie);
        this.venenosa = venenosa;
    }

    public void setCarnivora (boolean venenosa){
        this.venenosa = venenosa;
    }

    @Override
    public String toString() {
        return super.toString() + (venenosa ?"e venenosa":"nao e venenosa");
    }
}
