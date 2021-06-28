public class Passaro extends Animal {

    private String corPena;

    public Passaro () {
        super ("Piu-piu");
        this.corPena = "amarela";
    }

    public Passaro ( String nome ) {
        super ( nome );
        this.corPena = "amarela";
    }

    public Passaro ( String nome, int idade ) {
        super ( nome, idade );
        this.corPena = "amarela";
    }

    public Passaro ( String nome, int idade, String especie ) {
        super ( nome, idade, especie );
        this.corPena = "amarela";
    }

    public Passaro ( String nome, int idade, String especie, String corPena ) {
        super ( nome, idade, especie );
        this.corPena = "amarela";
        setCorPena ( corPena );
    }

    public void setCorPena ( String corPena ) {
        if ( ! corPena.isEmpty() ) {
            this.corPena = corPena;
        }
    }

    public String getCorPena () {
        return corPena;
    }

    @Override
    public String toString () {
        return "[Nome: " + getNome() +
                ", Idade: " + getIdade() +
                ", Especie: " + especie +
                ", Cor da pena: " + corPena + "]";
    }
}
