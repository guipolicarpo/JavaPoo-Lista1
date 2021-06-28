public class Cliente {
    private String nome;
    private String endereco;
    private int cpf;

    public Cliente () {
        this.nome = "Dionesio";
        this.endereco = "Na casa dele";
        this.cpf = 2424;
    }

    public void setNome (String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }

    public void setEndereco (String endereco) {
        if(!endereco.isEmpty()){
            this.endereco = endereco;
        }
    }

    public void setCpf (int cpf) {
        if(cpf > 0) {
            this.cpf = cpf;
        }
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public int getCpf () {
        return cpf;
    }
}
