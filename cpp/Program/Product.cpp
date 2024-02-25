/*
Saya Rifanny Lysara Annastasya [2200163] mengerjakan LP2 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek (DPBO) untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

#include <string>
using namespace std;

class Product {
protected:
    string idProduct; // ID produk
    string name;      // Nama produk
    string brand;     // Merek produk
    string price;     // Harga produk

public:
    // Konstruktor default untuk kelas Product
    Product() : idProduct(""), name(""), brand(""), price("") {}

    // Konstruktor parameterized untuk kelas Product
    Product(string id, string n, string b, string p) : idProduct(id), name(n), brand(b), price(p) {}

    // Metode untuk mengakses nilai ID produk
    string getIdProduct() { return idProduct; }

    // Metode untuk mengakses nilai nama produk
    string getName() { return name; }

    // Metode untuk mengakses nilai merek produk
    string getBrand() { return brand; }

    // Metode untuk mengakses nilai harga produk
    string getPrice() { return price; }

    // Menjadikan kelas ini polymorphic dengan menambahkan fungsi virtual
    virtual ~Product() {}
};
