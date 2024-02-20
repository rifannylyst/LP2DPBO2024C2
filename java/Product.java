/*
Saya Rifanny Lysara Annastasya [2200163] mengerjakan LP1 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek (DPBO) untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

import java.util.ArrayList;
import java.util.Scanner;

// Deklarasi kelas Product
class Product {
    // Deklarasi atribut-atribut private dari kelas Product
    private String idProduct; // ID produk
    private String name;      // Nama produk
    private String brand;     // Merek produk
    private String price;     // Harga produk

    // Konstruktor default untuk kelas Product
    public Product() {
        // Menginisialisasi semua atribut dengan string kosong
        this.idProduct = "";
        this.name = "";
        this.brand = "";
        this.price = "";
    }

    // Konstruktor parameterized untuk kelas Product
    public Product(String idProduct, String name, String brand, String price) {
        // Menginisialisasi atribut dengan nilai yang diberikan
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // Metode untuk mengakses nilai ID produk
    public String getIdProduct() {
        return this.idProduct;
    }

    // Metode untuk mengakses nilai nama produk
    public String getName() {
        return this.name;
    }

    // Metode untuk mengakses nilai merek produk
    public String getBrand() {
        return this.brand;
    }

    // Metode untuk mengakses nilai harga produk
    public String getPrice() {
        return this.price;
    }
}
