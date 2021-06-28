public class usaFornecedor {
    public static void main(String[] args) {
        Fornecedor f = new Fornecedor();

        f.setNome("Alberto");
        f.setIdade(69);
        f.setValorMaximo(200);
        f.setValorDevido(250);

        System.out.println(f);
    }
    
}
