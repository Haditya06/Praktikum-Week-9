# ☕ Praktikum 7 — Pemrograman Dasar (Java)

Repositori ini berisi penyelesaian **Praktikum 7** mata kuliah Pemrograman Dasar dengan fokus pada *Function*, *Object Oriented Programming (OOP)*, *Service Class*, serta penerapan logika perhitungan dan transaksi sederhana menggunakan Java.
 

## 📘 Daftar Isi
 
* Soal 1 — Fungsi F(x, y)
* Soal 2 — Perhitungan Nilai Mata Kuliah (OOP)
* Pengamatan — Penjelasan Keyword `this`
* Jurnal Mandiri — Transaksi TelUCoffee
* Struktur Project
* Cara Menjalankan 

---

## 🧮 Soal 1 — Menghitung Fungsi F(x, y)

Buat aplikasi untuk menghitung rumus berikut:

```
F(x, y) = xy + 2x + 2y + 6
```

### Ketentuan:

* Buat **method** yang menerima parameter `x` dan `y`.
* Method mengembalikan hasil perhitungan.
* Program menjalankan perulangan **sebanyak 5 kali**.
* Setiap iterasi user memasukkan nilai `x` dan `y`.

---

## 🏫 Soal 2 — Program Perhitungan Nilai Mata Kuliah (OOP)

Nilai akhir dihitung berdasarkan bobot berikut:

| Komponen     | Bobot |
| ------------ | ----- |
| Assessment 1 | 15%   |
| Assessment 2 | 15%   |
| Assessment 3 | 10%   |
| Tugas        | 20%   |
| Praktikum    | 40%   |

### 📌 Kelas yang Dibuat

#### 1️⃣ **Class `NilaiMK`**

Berisi atribut:

* `nim`
* `a1, a2, a3`
* `tugas`
* `prakt`
* `nilai`

Tugas:

* Membuat konstruktor
* Membuat setter & getter

---

#### 2️⃣ **Class `NilaiService`**

Berisi method:

* `inputNilai()` — memasukkan nilai mahasiswa
* `lihatNilai()` — menampilkan detail nilai
* `hitungNilai()` — menghitung nilai akhir berdasarkan bobot

---

#### 3️⃣ **Class Driver (`Main`)**

Menjalankan seluruh proses:

* Input data
* Hitung nilai
* Tampilkan hasil perhitungan

---

## 🔍 Pengamatan — Penjelasan Keyword `this`

Keyword **`this`** digunakan untuk:

### 1. Membedakan atribut class dan parameter method

Contoh:

```
this.a1 = a1;
```

`this.a1` adalah milik objek, sedangkan `a1` adalah parameter.

### 2. Mengakses method atau variabel dalam objek yang sama

```
this.hitungNilai();
```

### 3. Mengirim reference objek saat ini ke method lain

Digunakan pada konsep OOP lanjutan.

---

## ☕ Jurnal Mandiri — Aplikasi Transaksi TelUCoffee

Buat aplikasi transaksi pembelian makanan dan minuman.

### Fitur:

1. Menampilkan **4 menu makanan**.
2. Menampilkan **4 menu minuman**.
3. User memilih menu dan jumlah.
4. Hitung total harga makanan & minuman.
5. Input uang pembayaran.
6. Hitung dan tampilkan kembalian.
7. Tampilkan slip transaksi lengkap.

### Class `Pesanan` (dari soal):

Berisi atribut:

* `jumlahmakanan1` s/d `jumlahmakanan4`
* `jumlahminuman1` s/d `jumlahminuman4`
* `jumlah_harga`

Disertai:

* Konstruktor
* Setter
* Getter

## ▶️ Cara Menjalankan Program di terminal

### Compile:

```
javac src/*.javac NameFile.java
```

### Jalankan:

```
javac src/*java NameFile
```
