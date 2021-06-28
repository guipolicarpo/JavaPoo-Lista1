import jdk.nashorn.internal.ir.Module.ImportEntry;

public class Empregado extends Pessoa {

    private int numeroSecao;
    private double salarioBase, impostoder;

    public Empregado (){
        super ();
        this.numeroSecao = 1;
        this.salarioBase = 1100;
        this.impostoder = 5;
    }

    public void setNumeroSecao(int numeroSecao) {
        if(numeroSecao > 0){
            this.numeroSecao = numeroSecao;
        }
    }

    public void setSalarioBase(double salarioBase){
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        }   
    }

    public void setImpostoDeR(double impostoder){
        if (impostoder >= 0 && impostoder <= 100) {
            this.impostoder = impostoder;
        }
    }

    public int getNumeroSecao(){
        return numeroSecao;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public double getImpostoDeR(){
        return impostoder;
    }

    public double calcularSalario(){
        return salarioBase - (salarioBase * impostoder/100);
    }

    @Override
    public String toString(){
        return super.toString() + "[Numero da Secao: " + this.numeroSecao + ", Salario Base: " + this.salarioBase + ", Imposto de Renda: " + impostoder + ", Salario: " + calcularSalario() + "]";
    }
}
