public class Conta {
    int numero;
    double saldo;
    String transacao;

    public Conta (){
        this.numero = 1;
        this.saldo = 0.0;
        this.transacao = "abertura";
    }

    public void setNumero (int numero){
        this.numero = numero;
    }

    public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public void setTransacao (String transacao){
        this.transacao = transacao;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTransacao () {
        return transacao;
    }

    @Override
    public String toString (){
        return "["+ numero +", " + saldo + ", " + transacao + "]";
    }
}
