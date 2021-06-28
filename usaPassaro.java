public class UsaPassaro {

    public static void main (String[] args) {

        Passaro p1 = new Passaro();
        Passaro p2 = new Passaro("Zeca Urubu");
        Passaro p3 = new Passaro("Pica-pau", 76);
        Passaro p4 = new Passaro("Jaja", 3, "Gaviao");
        Passaro p5 = new Passaro("Rolinha", 2, "Pomba", "Cinza");

        System.out.println ( "[P1]: " + p1 );
        System.out.println ( "[P2]: " + p2 );
        System.out.println ( "[P3]: " + p3 );
        System.out.println ( "[P4]: " + p4 );
        System.out.println ( "[P5]: " + p5 );
    }
}
