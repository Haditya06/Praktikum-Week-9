import java.util.Scanner;

class pesanan {
    private int jumlahMakanan1, jumlahMakanan2, jumlahMakanan3, jumlahMakanan4;
    private int jumlahMinuman1, jumlahMinuman2, jumlahMinuman3, jumlahMinuman4;
    private double jumlah_Harga, uangCas;

    pesanan(int jumlahMakanan1, int jumlahMakanan2, int jumlahMakanan3, int jumlahMakanan4,
            int jumlahMinuman1, int jumlahMinuman2, int jumlahMinuman3, int jumlahMinuman4,
            double jumlah_Harga, double uangCas) {

        this.jumlahMakanan1 = jumlahMakanan1;
        this.jumlahMakanan2 = jumlahMakanan2;
        this.jumlahMakanan3 = jumlahMakanan3;
        this.jumlahMakanan4 = jumlahMakanan4;
        this.jumlahMinuman1 = jumlahMinuman1;
        this.jumlahMinuman2 = jumlahMinuman2;
        this.jumlahMinuman3 = jumlahMinuman3;
        this.jumlahMinuman4 = jumlahMinuman4;
        this.jumlah_Harga = jumlah_Harga;
        this.uangCas = uangCas;
    }

    pesanan(String makanan, String minuman, int hargaMakanan, int hargaMinuman,
            int jumlahMakanan, int jumlahMinuman, double uangCas) {

        this.jumlahMakanan1 = jumlahMakanan;
        this.jumlahMinuman1 = jumlahMinuman;

        this.jumlah_Harga = 0;
        this.uangCas = uangCas;
    }

    public void setJumlahMakanan1(int jumlahMakanan1){
        this.jumlahMakanan1 = jumlahMakanan1;
    }
    public int getJumlahMakanan1(){
        return jumlahMakanan1;
    }
    public void setJumlahMakanan2(int jumlahMakanan2){
        this.jumlahMakanan2 = jumlahMakanan2;
    }
    public int getJumlahMakanan2(){
        return jumlahMakanan2;
    }
    public void setJumlahMakanan3(int jumlahMakanan3){
         this.jumlahMakanan3 = jumlahMakanan3;
    }
    public int getJumlahMakanan3(){
         return jumlahMakanan3; 
    }

    public void setJumlahMakanan4(int jumlahMakanan4){
         this.jumlahMakanan4 = jumlahMakanan4;
    }
    public int getJumlahMakanan4(){
        return jumlahMakanan4;
    }
    public void setJumlahMinuman1(int jumlahMinuman1){
        this.jumlahMinuman1 = jumlahMinuman1;
    }
    public int getJumlahMinuman1(){
        return jumlahMinuman1;
    }
    public void setJumlahMinuman2(int jumlahMinuman2){ 
        this.jumlahMinuman2 = jumlahMinuman2;
    }
    public int getJumlahMinuman2(){ 
        return jumlahMinuman2; 
    }
    public void setJumlahMinuman3(int jumlahMinuman3){ 
        this.jumlahMinuman3 = jumlahMinuman3; 
    }
    public int getJumlahMinuman3(){ 
        return jumlahMinuman3; 
    }
    public void setJumlahMinuman4(int jumlahMinuman4){ 
        this.jumlahMinuman4 = jumlahMinuman4; 
    }
    public int getJumlahMinuman4(){ 
        return jumlahMinuman4; 
    }
    public void setJumlahHarga(double jumlah_Harga){ 
        this.jumlah_Harga = jumlah_Harga; 
    }
    public double getJumlahHarga(){ 
        return jumlah_Harga; 
    }
    public void setUangCas(double uangCas){ 
        this.uangCas = uangCas; 
    }
    public double getUangCas(){ 
        return uangCas; 
    }
}


class Mandiri1 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Mandiri1 l = new Mandiri1();
        l.runThis();
    }

    void runThis() {
        pesanan pesanan = inputData();
        ViewData(pesanan);
        double totalHarga = TotalHarga(pesanan);
        double kembalian = Kembalian(pesanan);

        System.out.println("Total harga \t: Rp " + totalHarga);
        System.out.println("Kembalian \t: Rp " + kembalian);
    }

    public pesanan inputData() {
        int jumlahMakanan, jumlahMinuman, makanan, minuman;
        String namaMakanan = "";
        String namaMinuman = "";
        int hargaMakanan = 0;
        int hargaMinuman = 0;
        double uangCas;

        System.out.println("\n=== Menu Makanan ===");
        System.out.println("1. Nasi Goreng 20 Ribu");
        System.out.println("2. Nasi Geprek Ayam 15 Ribu");
        System.out.println("3. Sosis Bakar 10 Ribu");
        System.out.println("4. Bakso bakar 5 Ribu ");
        System.out.print("Pilih 1 - 4 : ");
        makanan = sc.nextInt();

        System.out.print("Jumlah Pesanan : ");
        jumlahMakanan = sc.nextInt();

        System.out.println("\n=== Menu Minuman ===");
        System.out.println("1. Es teh 10 Ribu");
        System.out.println("2. Aqua 5 Ribu");
        System.out.println("3. Jus 25 Ribu");
        System.out.println("4. Pop ice 5 Ribu");
        System.out.print("Masukan angka 1 - 4 : ");
        minuman = sc.nextInt();

        System.out.print("Jumlah Pesanan : ");
        jumlahMinuman = sc.nextInt();
        System.out.print("Uang cas : Rp ");
        uangCas = sc.nextDouble();

        switch(makanan){
            case 1 : hargaMakanan = 20;
                 namaMakanan = "Nasi Goreng"; 
                 break;
            case 2 : hargaMakanan = 15; 
                 namaMakanan = "Nasi Geprek Ayam"; 
                 break;
            case 3 : hargaMakanan = 10; 
                namaMakanan = "Sosis Bakar"; 
                break;
            case 4 : hargaMakanan = 5; 
                namaMakanan = "Bakso Bakar"; 
                break;
        }

        switch(minuman){
            case 1 : hargaMinuman = 10; 
                namaMinuman = "Es teh"; 
                break;
            case 2 : hargaMinuman = 5; 
                namaMinuman = "Aqua"; 
                break;
            case 3 : hargaMinuman = 25; 
                namaMinuman = "Jus"; 
                break;
            case 4 : hargaMinuman = 5; 
                namaMinuman = "Pop Ice"; 
                break;
        }
        pesanan p = new pesanan(namaMakanan, namaMinuman, hargaMakanan, hargaMinuman, jumlahMakanan, jumlahMinuman, uangCas);
        return p;
    }

    public void ViewData(pesanan pesanan){
        System.out.println("\n=== Detail Pesanan ===");
        System.out.println("\nMakanan");
        System.out.println("Jumlah makanan   : Rp "+ pesanan.getJumlahMakanan1());
        System.out.println("\nMinuman");
        System.out.println("Jumlah minuman   : Rp "+ pesanan.getJumlahMinuman1());
        System.out.println("\nUang pelanggan \t: Rp "+ pesanan.getUangCas());
    }

    public double TotalHarga(pesanan pesanan){
        double totalHarga = (pesanan.getJumlahMakanan1() * 1) + (pesanan.getJumlahMinuman1() * 1);
        pesanan.setJumlahHarga(totalHarga);
        return totalHarga;
    }
    public double Kembalian(pesanan pesanan){
        if (pesanan.getUangCas() < pesanan.getJumlahHarga()) {
            System.out.println("Uang cas kurang");
            System.out.print("uang Kembalian : Rp ");
            double uangCas = sc.nextDouble();
            pesanan.setUangCas(uangCas);
            return Kembalian(pesanan);
        }
        return pesanan.getUangCas() - pesanan.getJumlahHarga();
    }
}
