# ✨ Praktikum Week 9 — Prosedur & Fungsi Java 

<p align="center">
  <img src="https://img.shields.io/badge/Java-Ready-orange?style=flat-square">
  <img src="https://img.shields.io/badge/Vibes-Gen%20Z-pink?style=flat-square"> 
  <img src="https://img.shields.io/badge/Mood-Productive-green?style=flat-square">
</p>

Repo ini berisi:

- 🧩 **Praktik 1** — Hitung vokal, konsonan, angka & special char  
- 🕌 **Praktik 2** — Kalkulator zakat 2.5% (auto berkah edition)  
- 💰 **Jurnal Mandiri** — Hitung pajak PPH (versi anti-stress)

---

# 🎯 Goals  
- Biar kamu makin ngerti **method**, **parameter**, dan **logic bersih**.  
- README lebih aesthetic, rapi, dan siap tampil di GitHub buat impress HRD 😎📈  

---

# 🧩 Praktik 1 — Hitung Vokal, Konsonan, Angka, & Special Char

Contoh input: `"POKEMON123&*."`  
Vibes: data analyst tapi masih gaming 🎮🔥

## 🔧 Source Code
```java
public class HitungKarakter {

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aiueo".indexOf(c) != -1;
    }

    static boolean isConsonant(char c) {
        return Character.isLetter(c) && !isVowel(c);
    }

    static boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    static boolean isSpecial(char c) {
        return !Character.isLetterOrDigit(c);
    }

    public static void main(String[] args) {
        String kalimat = "POKEMON123&*.";

        int vokal = 0, kons = 0, angka = 0, special = 0;

        for (char c : kalimat.toCharArray()) {
            if (isVowel(c)) vokal++;
            else if (isConsonant(c)) kons++;
            else if (isDigit(c)) angka++;
            else special++;
        }

        System.out.println("Vokal : " + vokal);
        System.out.println("Konsonan : " + kons);
        System.out.println("Angka : " + angka);
        System.out.println("Karakter Khusus : " + special);
    }
}

```
## 📊 Output
yaml
Salin kode
Vokal : 3
Konsonan : 4
Angka : 3
Karakter Khusus : 3


## 🕌 Praktik 2 — Zakat Calculator 2.5%
Ngoding sambil inget akhirat vibes-nya beda 🤲✨

```
public class ZakatPenghasilan {

    static double hitungNisab(double hargaEmas) {
        return 85 * hargaEmas;
    }

    static double hitungZakat(double penghasilanBersih) {
        return penghasilanBersih * 0.025;
    }

    public static void main(String[] args) {
        double penghasilan = 100000000;
        double pengeluaran = 15000000;
        double hargaEmas = 1500000;

        double bersih = penghasilan - pengeluaran;
        double nisab = hitungNisab(hargaEmas);

        System.out.println("Jumlah Pendapatan : " + penghasilan);
        System.out.println("Penghasilan Bersih : " + bersih);

        if (bersih >= nisab) {
            System.out.println("Status Nisab : Melebihi Nisab ✨");
            System.out.println("Total Zakat : " + hitungZakat(bersih));
        } else {
            System.out.println("Status Nisab : Tidak Wajib Zakat 😌");
        }
    }
}
```

## 💰 Jurnal Mandiri — Kalkulator PPH (Chill Edition)
Hitung pajak tapi tetap tenang, bukan overthinking 😭✨

```
public class PajakPenghasilan {

    static int hitungPTKP(String status, int anak) {
        int dasar = 54000000;

        if (status.equalsIgnoreCase("menikah")) dasar += 4500000;
        dasar += Math.min(anak, 3) * 4500000;

        return dasar;
    }

    static double hitungPajak(double pkp) {
        double total = 0;

        double lapis1 = Math.min(pkp, 60000000);
        total += lapis1 * 0.05;

        if (pkp > 60000000) {
            double lapis2 = Math.min(pkp - 60000000, 250000000 - 60000000);
            total += lapis2 * 0.15;
        }

        return total;
    }

    public static void main(String[] args) {
        double pendapatan = 200000000;
        String status = "menikah";
        int anak = 2;

        int ptkp = hitungPTKP(status, anak);
        double pkp = pendapatan - ptkp;
        double pajak = hitungPajak(pkp);

        System.out.println("PTKP = " + ptkp);
        System.out.println("PKP = " + pkp);
        System.out.println("Total Pajak = " + pajak + " 💸");
    }
}
```
