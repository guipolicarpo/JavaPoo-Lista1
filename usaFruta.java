import java.util.Scanner;
import java.util.Arrays;

public class usaFruta {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        Fruta abacate = new Fruta();
        Maca fuji = new Maca();
        Pera doce = new Pera();
        Uva rubi = new Uva();

        /*
        if(abacate instanceof Fruta){
            System.out.println("Abacate e uma fruta!");
        }

        if (abacate instanceof Object) {
            System.out.println("Abacate e um Object!");
        }

        if (abacate instanceof Maca) {
            System.out.println("Abacate e uma Maca!");
        } else{
            System.out.println("Abacate nao e uma Maca!");
        }
        */

        if(fuji instanceof Maca) System.out.println("Fuji e Maca");
        if(fuji instanceof Fruta) System.out.println("Fuji e Fruta");
        if (fuji instanceof Object) System.out.println("Fuji e Object");
        
        Object[] cesta = new Object[10];
        int[] numeros = {1, 5, 4, 2, 5};
        
        cesta[0] = new Object();
        cesta[1] = new Fruta();
        cesta[2] = new Maca();
        cesta[3] = new Pera();
        cesta[4] = new Uva();
        cesta[5] = new Scanner(System.in);

        //System.out.println(Arrays.toString(cesta));

        Fruta[] cesta2 = new Fruta[10];
        cesta2[0] = new Maca();
        cesta2[1] = new Pera();
        cesta2[2] = new Uva();
        cesta2[3] = new Fruta();
        cesta2[4] = abacate;
        cesta2[5] = fuji;
        cesta2[6] = doce;
        cesta2[7] = rubi;

        System.out.println(Arrays.toString(cesta2));
    }
}
