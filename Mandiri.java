import java.util.Scanner;

public class Mandiri {
    public static void main(String[] args) {
        Mandiri program = new Mandiri();
        program.runThis();
    }

    public void runThis() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total Pendapatan dalam 1 Tahun : ");
        double pendapatan = sc.nextDouble();
        sc.nextLine();  

        System.out.print("Status Perkawinan (menikah/belum menikah) : ");
        String status = sc.nextLine().toLowerCase();

        System.out.print("Jumlah Anak : ");
        int anak = sc.nextInt();


        double PTKP = calculatePTKP(status, anak);

        double PKP = pendapatan - PTKP;
        if (PKP < 0) {
            PKP = 0;
        }

        double pajak5 = 0, pajak15 = 0;
        if (PKP > 60000000) {
            pajak5 = 60000000 * 0.05;
            pajak15 = (PKP - 60000000) * 0.15;
        } else {
            pajak5 = PKP * 0.05;
        }

        double totalPajak = pajak5 + pajak15;

        System.out.println("1. PTKP (Pendapatan tidak kena pajak) = " + (long) PTKP);
        System.out.println("2. PKP (Pendapatan Kena Pajak) = " + (long) PKP);
        System.out.println("3. Pajak");
        if (pajak5 > 0) {
            System.out.println("   a. Tarif 5 % : 60000000 * 5% = " + (long)pajak5);
        } else {
            System.out.println("   a. Tarif 5 % : " + (long)PKP + " * 5% = " + (long)pajak5);
        }
        if (pajak15 > 0) {
            System.out.println("   b. Tarif 15% : " + (long)(PKP - 60000000) + " * 15% = " + (long)pajak15);
        }
        System.out.println("4. Total Pajak yang harus dibayarkan = " + (long)totalPajak);
    }

    private double calculatePTKP(String status, int anak) {
        double basePTKP = 54000000;
        double tambahanNikah = 4500000;
        double tambahanAnak = 4500000;
        int maxAnak = 3;

        double ptkp = basePTKP;

        if (status.equals("menikah")) {
            ptkp += tambahanNikah;
        }

        int validAnak = Math.min(anak, maxAnak);
        ptkp += tambahanAnak * validAnak;

        return ptkp;
    }
}
