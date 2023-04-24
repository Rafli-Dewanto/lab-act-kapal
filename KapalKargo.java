public class KapalKargo extends Kapal {
    private int kapasitasAngkut;

    public KapalKargo(String nama, int tahunPembuatan, int kapasitasAngkut) {
        super(nama, tahunPembuatan);
        this.kapasitasAngkut = kapasitasAngkut;
    }

    public int getKapasitasAngkut() {
        return kapasitasAngkut;
    }

    @Override
    public String toString() {
        return "Nama: " + this.getNama() + "\n" +
                "Kapasitas Angkut: " + this.getKapasitasAngkut();
    }
}
