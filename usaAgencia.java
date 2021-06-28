public class usaAgencia {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();

        System.out.println(agencia);

        agencia.setCodigo(1580);
        agencia.setNome("Caixa");

        System.out.println(agencia);
    }
}
