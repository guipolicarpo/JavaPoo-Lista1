public class Administrador extends Empregado{

    private double ajudaDeCusto;

    public Administrador (){
        super ();
        this.ajudaDeCusto = 200;
    }

    public void setAjudaDeCusto (double ajudaDeCusto) {
        if (ajudaDeCusto >= 0){
            this.ajudaDeCusto = ajudaDeCusto;
        }
    }

    public double getAjudaDeCusto(){
        return ajudaDeCusto;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + ajudaDeCusto;
    }

    @Override
    public String toString (){
        return super.toString() +  "[Ajuda de custo: " + this.ajudaDeCusto + "]";
    }
}
