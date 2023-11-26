public class MainApp {
    public static void main(String[] args) throws Exception {
        Kendaraan a = new Kendaraan("A1", 150, 4);
        Mobil b = new Mobil("B2", 250, 6, 4);
        Bus c = new Bus("C3", 200, 50, 40);

        System.out.println("\n Informasi Kendaraan = " + a);
        System.out.println("\n Informasi Mobil = " + b);
        System.out.println("\n Informasi Bus = " + c);
    }
}
