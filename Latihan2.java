import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        Latihan2 zakat = new Latihan2();
        zakat.runThis();
    }

    public void runThis() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Besar Penghasilan : ");
        double penghasilan = sc.nextDouble();

        System.out.print("Besaran Pengeluaran : ");
        double pengeluaran = sc.nextDouble();

        System.out.println("\n=====================");

        double nisab = getNisab();
        System.out.println("Jumlah Pendapatan : Rp. " + penghasilan);

        if (cekNisab(penghasilan, nisab)) {
            System.out.println("Status Nisab                      : Melebihi Nisab");
            double pendapatanBersih = penghasilan - pengeluaran;
            System.out.println("Besaran Penghasilan Bersih        : Rp. " + pendapatanBersih);
            double zakat = hitungZakat(pendapatanBersih);
            System.out.println("Total Zakat yang harus dibayarkan : Rp " + zakat);
        } else {
            System.out.println("Status Nisab: Belum Melebihi Nisab");
            System.out.println("Besaran Penghasilan Bersih: -");
            System.out.println("Total Zakat yang harus dibayarkan: Rp 0");
        }
    }
    public double getNisab() {
        double hargaEmasPerGram = 1500000;
        double nisabGram = 85;
        return nisabGram * 1000000; 
    }
    public boolean cekNisab(double penghasilan, double nisab) {
        return penghasilan > nisab;
    }
    public double hitungZakat(double penghasilanBersih) {
        if (penghasilanBersih <= 0) {
            return 0;
        }
        return penghasilanBersih * 0.025;
    }
}
