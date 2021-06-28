public class Operario extends Empregado{
    private double valorDeProducao, comissao;

    public Operario (){
        super();
        this.valorDeProducao = 100000;
        this.comissao = 1;
    }

    public void setValorDeProducao (double valorDeProducao){
        if (valorDeProducao >= 0) {
                this.valorDeProducao = valorDeProducao;
        }
    }

    public void setComissao (double comissao){
        if (comissao >= 0 && comissao <= 10) {
            this.comissao = comissao;
        }
    }

    public double getValorDeProducao (){
        return valorDeProducao;
    }

    public double getComissao (){
        return comissao;
    }

    @Override
    public String toString(){
        return super.toString() + "[Valor Produção: " + calcularSalario() + (valorDeProducao * comissao / 100) + "]";
    }
}
