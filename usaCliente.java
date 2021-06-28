
public class usaCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        System.out.println(cliente.getNome());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCpf());

        cliente.setNome("");
        cliente.setEndereco("Outro lugar");
        cliente.setCpf(147);

        System.out.println(cliente.getNome());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCpf());


    }
}
