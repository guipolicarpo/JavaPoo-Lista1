public class Fornecedor extends Pessoa {
    private double valorMaximo, valorDevido;
    public Fornecedor() {
        super();
        this.valorMaximo = 1000;
        this.valorDevido = 0.0; 
    }

    public void setValorMaximo (double valorMaximo){
        if (valorMaximo > 0.0){
            this.valorMaximo = valorMaximo;
        }
    }

    public void setValorDevido (double valorDevido){
        if (valorDevido >= 0.0 && valorDevido <= this.valorMaximo) {
            this.valorDevido = valorDevido;
        }
    }

    public double getValorMaximo(){
        return valorMaximo;
    }

    public double getValorDevido(){
        return valorDevido;
    }

    public double obterSaldo(){
        return valorMaximo - valorDevido;
    }

    @Override
    public String toString (){
        return super.toString() + "[Valor Maximo: " + this.valorMaximo + ", Valor Devido: " + this.valorDevido + ", Saldo: " + obterSaldo() + "]";
    }


}
