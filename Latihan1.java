import java.util.Scanner;

public class Latihan1 {
	public static void main(String[] args) {
		Latihan1 hk = new Latihan1();
		hk.runThis();

	}
    public void runThis() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Kata: ");
        String kalimat = sc.nextLine();

        int vokal = 0, kosonan = 0, angka = 0, special = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);

            if (isVowel(c)) {
                vokal++;
            } else if (isKosonan(c)) {
                kosonan++;
            } else if (isDigit(c)) {    
                angka++;
            } else {
                special++;
            }
        }

        System.out.println("Vokal : " + vokal);
        System.out.println("Kosonan : " + kosonan);
        System.out.println("Angka : " + angka);
        System.out.println("Special : " + special);
    }

    public boolean isVowel(char huruf) {
        huruf = Character.toLowerCase(huruf);
        return (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u');
    }
    public boolean isKosonan(char huruf) {
        huruf = Character.toLowerCase(huruf);
        return (huruf >= 'a' && huruf <= 'z' && !isVowel(huruf));
    }
    public boolean isDigit(char huruf) {
        return (huruf >= '0' && huruf <= '9');
    }
 }
