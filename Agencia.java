public class Agencia {
    private int codigo;
    private String nome;

    public Agencia (){
        this.codigo = 1501;
        this.nome = "Nome da Agencia Padrao";
    }

    public void setCodigo(int codigo) {
        if (codigo>1500&&codigo<1600)
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty())
        this.nome=nome;
    }

    public int getCodigo (){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString () {
        return "[Agencia: " + codigo + " - " + nome + "]";
    }
}