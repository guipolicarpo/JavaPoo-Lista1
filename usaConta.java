public class usaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();

        System.out.println(conta);

        conta.setSaldo(100.0);
        conta.setTransacao("deposito");

        System.out.println(conta);
    }
}
