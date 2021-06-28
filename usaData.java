public class usaData {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.setDia(3);
        System.out.println(d1);

        Data d2 = new Data(24, 512, 2021);
        System.out.println(d2);

        Data d3 = new Data (24, 5, 2021);
        System.out.println(d3);
    }
}
