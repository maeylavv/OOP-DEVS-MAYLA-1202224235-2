public class Bus extends Kendaraan {
    private int jumlahKursi;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahKursi) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJumlah Kursi = " + jumlahKursi + "\n\nWaktu Tempuh dengan Bus = " + super.hitungWaktuTempuh(350) + " jam";
    }
}
