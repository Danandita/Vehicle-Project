public class Car extends Vehicle {
    int harga=1000;
    // methods
    public int isi_bensin (int jumlah_liter,int jumlah_jarak) {
        super.bensin=jumlah_liter;
        super.jarak=jumlah_jarak;
        int bensin_car=super.jumlah_bensin()*harga;
        return bensin_car;
    }
}
