public class Arvore extends Planta{

    private boolean frutifera;

    public Arvore(String nome, String especie, boolean frutifera) {
        super(nome, especie);
        this.frutifera = frutifera;
    }

    public void setFrutifera (boolean frutifera){
        this.frutifera = frutifera;
    }

    @Override
    public String toString() {
        return super.toString() + (frutifera ?"e frutifera":"nao e frutifera");
    }
}

