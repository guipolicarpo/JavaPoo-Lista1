public class Pera extends Fruta{

    boolean madura;

    public Pera() {
        super();
        madura = true;
    }

    @Override
    public String toString() {
        return "[Pera: " + nome + ", Madura: " + madura + "]";
    }
}
