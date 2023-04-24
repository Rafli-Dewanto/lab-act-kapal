public class KapalPesiar extends Kapal {
    private int maksPenumpang;

    public KapalPesiar(String nama, int tahunPembuatan, int maksPenumpang) {
        super(nama, tahunPembuatan);
        this.maksPenumpang = maksPenumpang;
    }

    public int getMaksPenumpang() {
        return maksPenumpang;
    }

    @Override
    public String toString() {
        return  "Nama: " + getNama() + "\n" +
                "Maks. Penumpang: " + getMaksPenumpang();
    }
}
