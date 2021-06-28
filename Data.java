public class Data {

    private int dia, mes, ano;

    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;
    }

    public Data (int dia, int mes, int ano){
        setData(1, 1, 1900);
        setData(dia, mes, ano);
    }

    void setData(int dia, int mes, int ano){
        setDia ( dia );
        setMes( mes );
        setAno ( ano );
    }

    public void setDia (int dia){
        if (dia >= 1 && dia <= 31){
            this.dia = dia;
        }
        
    }

    public void setMes (int mes){
        if (mes >= 1 && mes <= 12){
        this.mes = mes;
        }
    }

    public void setAno (int ano){
        if (dia >= 1 && dia <= 2100){
        this.ano = ano;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno(){
        return ano;
    }

    @Override
    public String toString(){
        return "[" + dia + "/" + mes + "/" + ano + "]";
    }
}
