/*
Saya Rifanny Lysara Annastasya [2200163] mengerjakan LP2 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek (DPBO) untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

class Shirt extends Clothing { // Mendefinisikan kelas Shirt yang merupakan turunan dari kelas Clothing
    private String color; // Mendeklarasikan variabel color sebagai warna kemeja
    private String sleeveType; // Mendeklarasikan variabel sleeveType sebagai tipe lengan kemeja

    public Shirt() { // Konstruktor default untuk kelas Shirt
        this.color = ""; // Menginisialisasi warna kemeja dengan string kosong
        this.sleeveType = ""; // Menginisialisasi tipe lengan kemeja dengan string kosong
    }

    public Shirt(String idProduct, String name, String brand, String price, String size, String material, String gender, String color, String sleeveType) {
        // Konstruktor kustom untuk kelas Shirt dengan parameter yang mencakup atribut dari superclass Clothing serta color dan sleeveType
        super(idProduct, name, brand, price, size, material, gender); // Memanggil konstruktor superclass dengan menggunakan kata kunci super
        this.color = color; // Menginisialisasi warna kemeja dengan nilai yang diberikan
        this.sleeveType = sleeveType; // Menginisialisasi tipe lengan kemeja dengan nilai yang diberikan
    }

    public String getColor() { // Metode untuk mengembalikan warna kemeja
        return this.color; // Mengembalikan nilai warna kemeja
    }

    public String getSleeveType() { // Metode untuk mengembalikan tipe lengan kemeja
        return this.sleeveType; // Mengembalikan nilai tipe lengan kemeja
    }
}