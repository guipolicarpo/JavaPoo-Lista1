public class usarCelular {
    public static void main(String[] args) {
        Celular iphone = new Celular ();

        System.out.println( iphone.marca);
        System.out.println( iphone.modelo);
        System.out.println( iphone.preco);
        System.out.println( iphone.novo);

        iphone.fazerLigacao("2123-4567");
    }
}
