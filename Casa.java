public class Casa {
    boolean porta1;
    boolean porta2;
    boolean porta3;
    String corcasa;
    int portasAbertas;

    public Casa () {
        this.porta1 = false;
        this.porta2 = false;
        this.porta3 = false;
        this.corcasa = "Branca";
        this.portasAbertas = 0;
    }

    public void setAbrirPorta1 (boolean porta1) {
        this.porta1 = true;
        portasAbertas++;
        System.out.println("\nA porta 1 foi aberta!");
    }

    public void setAbrirPorta2 (boolean porta2) {
        this.porta2 = true;
        portasAbertas++;
        System.out.println("\nA porta 2 foi aberta!");
    }

    public void setAbrirPorta3 (boolean porta3) {
        this.porta3 = true;
        portasAbertas++;
        System.out.println("\nA porta 3 foi aberta!");
    }

    public void setFecharPorta1 (boolean porta1){
        this.porta1 = false;
        portasAbertas--;
        System.out.println("\nA porta 1 foi fechada!");
    }

    public void setFecharPorta2 (boolean porta2){
        this.porta2 = false;
        portasAbertas--;
        System.out.println("\nA porta 2 foi fechada!");
    }

    public void setFecharPorta3 (boolean porta3){
        this.porta3 = false;
        portasAbertas--;
        System.out.println("\nA porta 3 foi fechada!");
    }

    public void setPintarCasa (String corcasa){
        if(! corcasa.isEmpty()){
            this.corcasa = corcasa;
        }
    }

    public boolean getPorta1 (){
        return this.porta1;
    }

    public boolean getPorta2 (){
        return this.porta2;
    }

    public boolean getPorta3 (){
        return this.porta3;
    }

    public String getPintarCasa (){
        return this.corcasa;
    }

    public int getPortasAbertas () {
        return this.portasAbertas;
    }

    @Override
    public String toString (){
        System.out.println("\nFalse = Fechada | True = Aberta");
        return "[Porta 1: " + porta1 + ", Porta 2: " + porta2 + ", Porta 3: " + porta3 + ", Cor da Casa: " + corcasa + ", Portas Abertas: " + portasAbertas + "]";
    }

}
