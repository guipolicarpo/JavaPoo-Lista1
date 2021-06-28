public class Planta {

    private String nome, especie;

    public Planta(String nome, String especie){
        setPlanta("planta", "generica");
        setPlanta(nome, especie);
    }

    private void setPlanta (String nome, String especie){
        setNome(nome);
        setEspecie(especie);
    }

    public void setNome( String nome){
        if(nome.length() >= 3){
            this.nome = nome;
        }
    }

    public void setEspecie( String especie){
        if (especie.isEmpty() || especie == null) {
            throw new IllegalArgumentException("A especie precisa ter um valor, não pode ser nula!");
        }

        this.especie = especie;
    }

    @Override
    public String toString() {
        return nome + ", " + especie;
    }
}
