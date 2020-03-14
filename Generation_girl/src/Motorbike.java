public class Motorbike extends Vehicle {
    int harga=500;
    // methods
    public int isi_bensin (int jumlah_liter,int jumlah_jarak) {
        super.bensin=jumlah_liter;
        super.jarak=jumlah_jarak;
        int bensin_motorbike=super.jumlah_bensin()*harga;
        return bensin_motorbike;
    }
}
