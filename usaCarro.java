public class usaCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro("VW");

        c1.dd = new Pneu("GY", 17, 195, 85);
        c1.de = new Pneu("GY", 17, 195, 85);
        c1.td = new Pneu("GY", 17, 195, 85);
        c1.te = new Pneu("GY", 17, 195, 85);

        c1.dd.calibrar();

        System.out.println("Pneu DD: " + c1.dd.isCalibrado());
    }
}
