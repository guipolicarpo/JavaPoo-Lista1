public class usaFruta2 {
    public static void main(String[] args) {
        Fruta banana = new Fruta();
        banana.nome = "Ouro";

        System.out.println(banana);

        Maca maca = new Maca();
        maca.nome = "fuji";
        maca.cor = "vermelhinha";

        System.out.println(maca);


        Fruta goiaba = new Maca();
        goiaba.nome = "branca";
        ((Maca) goiaba).cor = "verde";

        System.out.println(goiaba);

        System.out.println(maca.morder());
    }
}
