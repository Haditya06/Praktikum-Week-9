import java.util.*;
public class Latihan1{
	static int hitung(int x, int y){
		int hasil = (x*y) + (2*x) + (2*y) + 6;
		return hasil;
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int a, b;
		for(int i = 0; i<5; i++){
			System.out.print("Masukan Nilai X : ");
			a = inp.nextInt();
			System.out.print("Masukan Nilai Y : ");
			b = inp.nextInt();
			int hasil = hitung(a,b);
			System.out.println("Untuk Nilai X : " + a + "\n\tDan Y : " + b);
			System.out.println("Hasilnya : " + hasil);
		}
		
		System.out.println("Kelar Loping");
		
	}
}