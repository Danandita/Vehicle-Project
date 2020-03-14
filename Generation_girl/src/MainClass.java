import java.util.Scanner;
public class MainClass {
public static void main(String[] args) {
Car Civic= new Car();
Scanner scan = new Scanner(System.in);
System.out.println("Enter jumlah liter");
int jumlah_liter=scan.nextInt();
System.out.println("Enter jumlah jarak");
int jumlah_jarak=scan.nextInt();
System.out.println(Civic.isi_bensin(jumlah_liter, jumlah_jarak));

        Motorbike PCX= new Motorbike();
        System.out.println("Enter jumlah liter");
        jumlah_liter=scan.nextInt();
        System.out.println("Enter jumlah jarak");
        jumlah_jarak=scan.nextInt();
        System.out.println(PCX.isi_bensin(jumlah_liter, jumlah_jarak));
}
}
