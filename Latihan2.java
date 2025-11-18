import java.util.Scanner;
class NilaiMK{
	private String nim;
	private int a1;
    private int a2;
    private int a3;
    private int tugas;
    private int prakt;
    private double nilai; 

    NilaiMK(String nim, int a1, int a2, int a3, int tugas, int prakt){
    	this.nim = nim;
    	this.a1 = a1;
    	this.a2 = a2;
    	this.a3 = a3;
    	this.tugas = tugas;
    	this.prakt = prakt;
    }   
    public void setNim(String nim){
    	this.nim = nim;
    }
    public String getNim(){
    	return nim;
    }
    public void setA1(int a1){
    	this.a1 = a1;
    }
    public int getA1(){
    	return a1;
    }
    public void setA2(int a2){
    	this.a2 = a2;
    }
    public int getA2(){
    	return a2;
    }
    public void setA3(int a3){
    	this.a3 = a3;
    }
    public int getA3(){
    	return a3;
    }
    public void setTugas(int tugas){
    	this.tugas = tugas;
    }
    public int getTugas(){
    	return tugas;
    }
    public void setPrakt(int prakt){
    	this.prakt = prakt;
    }
    public int getPrakt(){
    	return prakt;
    }
    public void setNilai(double nilai){
    	this.nilai = nilai;
    }
    public double getNilai(){
    	return nilai;
    }
}

class NilaiService{
	Scanner input = new Scanner(System.in);
	NilaiMK nm;

	public NilaiMK masukNilai(){
		String nim;
		int a1, a2, a3, tugas, prakt;
		System.out.println("=== Input Asesmen ===");
		System.out.print("Masukan Nim       : ");
		nim = input.nextLine();
		System.out.print("Masukan Asesmen 1 : ");
		a1 = input.nextInt();
		System.out.print("Masukan Asesmen 2 : ");
		a2 = input.nextInt();
		System.out.print("Masukan Asesmen 3 : ");
		a3 = input.nextInt();
		System.out.print("Masukan Tugas     : ");
		tugas = input.nextInt();
		System.out.print("Masukan Praktikum : ");
		prakt = input.nextInt();

		NilaiMK nm = new NilaiMK(nim, a1, a2, a3, tugas, prakt);
        nm.setNilai(HitungNilai(nm));
        return nm;
	}

	public double HitungNilai(NilaiMK nm){
		return (nm.getA1() * 0.15) + (nm.getA2() * 0.15) + (nm.getA3() * 0.10) + (nm.getTugas() * 0.20) + (nm.getPrakt() * 0.40);
	}
	public void printNilai(NilaiMK nm){
		System.out.println("\n=== Nilai Asesmen ===");
		System.out.println("NIm         : " + nm.getNim());
		System.out.println("Asesmen 1   : " + nm.getA1());
		System.out.println("Asesmen 2   : " + nm.getA2());
		System.out.println("Asesmen 3   : " + nm.getA3());
		System.out.println("Tugas       : " + nm.getTugas());
		System.out.println("Praktikum   : " + nm.getPrakt());
		System.out.println("Nilai Akhir : " + nm.getNilai());
}
}


public class Latihan2 {
	NilaiService n = new NilaiService();

	public static void main(String[] args) {
		Latihan2 d = new Latihan2();
		d.runThis();
	}
	public void runThis(){
		NilaiMK mahasiswa1 = n.masukNilai();
		n.printNilai(mahasiswa1);
	}
}


