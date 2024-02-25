###
Saya Rifanny Lysara Annastasya [2200163] mengerjakan LP1 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek (DPBO) untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
###

Desain Kelas:
![desainLP2](https://github.com/rifannylyst/LP2DPBO2024C2/assets/147616851/902ba24c-b753-46aa-a467-0dc909c25081)

Desain Program:
1. **Kelas `Product`**:
    - Kelas `Product` merupakan kelas dasar yang merepresentasikan produk secara umum.
    - Memiliki atribut seperti `idProduct`, `name`, `brand`, dan `price` untuk menggambarkan detail produk.
    - Menyediakan konstruktor default dan konstruktor parameterized, serta metode untuk mengakses nilai atribut.

2. **Kelas `Clothing`**:
    - Kelas `Clothing` merupakan subclass dari `Product`, yang mengkhususkan dalam pakaian.
    - Memiliki atribut tambahan seperti `size`, `material`, dan `gender` untuk membedakan jenis pakaian.
    - Mengimplementasikan konstruktor default dan parameterized untuk menginisialisasi atribut.
    - Menyediakan metode untuk mengakses nilai atribut yang telah ditambahkan.

3. **Kelas `Shirt`**:
    - Kelas `Shirt` merupakan subclass dari `Clothing`, yang lebih khusus lagi sebagai representasi kemeja.
    - Memiliki atribut tambahan seperti `color` dan `sleeveType` yang spesifik untuk kemeja.
    - Mengimplementasikan konstruktor default dan parameterized untuk menginisialisasi atribut kemeja.
    - Menyediakan metode untuk mengakses nilai atribut tambahan yang dimiliki oleh kelas `Shirt`.

4. **Main Class**:
    - Kelas `Main` merupakan kelas utama yang berfungsi sebagai entry point program.
    - Menggunakan `ArrayList` untuk menyimpan objek-objek kemeja yang telah dimasukkan.
    - Menggunakan `Scanner` untuk menerima input dari pengguna.
    - Meminta pengguna untuk memasukkan detail kemeja, seperti id, nama, merek, harga, ukuran, bahan, gender, warna, dan tipe lengan.
    - Objek kemeja yang dimasukkan kemudian disimpan dalam `ArrayList`.
    - Setelah selesai, program mencetak daftar kemeja yang telah dimasukkan dalam bentuk tabel yang terformat dengan rapih.
    - Metode `printShirts` digunakan untuk mencetak daftar kemeja dalam bentuk tabel dengan lebar kolom yang sesuai.
    - Terdapat metode `printTableHeader` dan `printTableFooter` untuk mencetak header dan footer tabel dengan format yang sesuai.
  
Penjelasan Alur:
1. **Pembuatan Objek dan Input Pengguna**:
   - Program dimulai dengan membuat objek ArrayList bernama `shirts` untuk menyimpan objek-objek kemeja.
   - Objek Scanner `sc` juga dibuat untuk menerima input dari pengguna.

2. **Input Jumlah dan Detail Kemeja**:
   - Pengguna diminta untuk memasukkan jumlah kemeja yang akan dimasukkan.
   - Program kemudian menggunakan loop untuk meminta detail dari setiap kemeja yang akan dimasukkan. Detail yang diminta termasuk id, nama, merek, harga, ukuran, bahan, gender, warna, dan tipe lengan.
   - Setiap detail tersebut dimasukkan oleh pengguna menggunakan Scanner dan disimpan dalam variabel yang sesuai.

3. **Membuat Objek Kemeja dan Menambahkannya ke ArrayList**:
   - Setelah menerima semua detail, program membuat objek kemeja baru menggunakan konstruktor khusus dari kelas `Shirt`, dengan detail yang dimasukkan oleh pengguna sebagai parameter.
   - Objek kemeja yang baru dibuat kemudian ditambahkan ke dalam ArrayList `shirts`.

4. **Menutup Objek Scanner**:
   - Setelah semua kemeja dimasukkan, objek Scanner ditutup untuk mencegah kebocoran sumber daya.

5. **Mencetak Daftar Kemeja**:
   - Setelah objek Scanner ditutup, program mencetak daftar kemeja yang telah dimasukkan.
   - Mencetak dilakukan dengan memanggil metode `printShirts` yang mencetak kemeja dalam format tabel yang terformat dengan rapih.

6. **Metode `printShirts`**:
   - Metode ini mengambil ArrayList `shirts` sebagai parameter.
   - Pertama-tama, metode ini menentukan lebar kolom untuk setiap atribut yang akan dicetak.
   - Kemudian, metode ini mencetak header tabel dengan menggunakan metode `printTableHeader`.
   - Selanjutnya, metode ini menggunakan loop untuk mencetak setiap baris data dari ArrayList `shirts` dalam format tabel yang terstruktur.
   - Setiap atribut kemeja dicetak dalam kolom yang sesuai dengan lebar yang telah ditentukan.
   - Setelah mencetak semua baris, metode ini mencetak footer tabel menggunakan metode `printTableFooter`.

Screenshot:
![masukan](https://github.com/rifannylyst/LP2DPBO2024C2/assets/147616851/e4cba12d-cef2-48c2-84a2-7ddf1a1f7841)
![keluaran](https://github.com/rifannylyst/LP2DPBO2024C2/assets/147616851/58bb5679-4624-462d-9ea1-63c4dc5a06e3)
