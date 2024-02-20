/*
Saya Rifanny Lysara Annastasya [2200163] mengerjakan LP2 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek (DPBO) untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

class Clothing extends Product { // Membuat kelas Clothing yang merupakan subclass dari kelas Product
    private String size; // Variabel instance untuk menyimpan ukuran pakaian
    private String material; // Variabel instance untuk menyimpan bahan pakaian
    private String gender; // Variabel instance untuk menyimpan jenis kelamin yang pakaian ditujukan

    // Konstruktor default untuk kelas Clothing
    public Clothing() {
        this.size = ""; // Menginisialisasi ukuran pakaian dengan string kosong
        this.material = ""; // Menginisialisasi bahan pakaian dengan string kosong
        this.gender = ""; // Menginisialisasi jenis kelamin dengan string kosong
    }

    // Konstruktor parameter untuk kelas Clothing
    public Clothing(String idProduct, String name, String brand, String price, String size, String material, String gender) {
        super(idProduct, name, brand, price); // Memanggil konstruktor kelas induk (Product)
        this.size = size; // Menginisialisasi ukuran pakaian
        this.material = material; // Menginisialisasi bahan pakaian
        this.gender = gender; // Menginisialisasi jenis kelamin
    }

    // Metode untuk mendapatkan ukuran pakaian
    public String getSize() {
        return this.size; // Mengembalikan ukuran pakaian
    }

    // Metode untuk mendapatkan bahan pakaian
    public String getMaterial() {
        return this.material; // Mengembalikan bahan pakaian
    }

    // Metode untuk mendapatkan jenis kelamin yang ditujukan pakaian
    public String getGender() {
        return this.gender; // Mengembalikan jenis kelamin
    }
}
