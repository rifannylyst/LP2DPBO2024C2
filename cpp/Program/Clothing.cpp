/*
Saya Rifanny Lysara Annastasya [2200163] mengerjakan LP2 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek (DPBO) untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

#include "Product.cpp"

class Clothing : public Product {
protected:
    string size;     // Ukuran pakaian
    string material; // Bahan pakaian
    string gender;   // Jenis kelamin yang ditujukan

public:
    // Konstruktor default untuk kelas Clothing
    Clothing() : size(""), material(""), gender("") {}

    // Konstruktor parameterized untuk kelas Clothing
    Clothing(string id, string n, string b, string p, string s, string m, string g)
        : Product(id, n, b, p), size(s), material(m), gender(g) {}

    // Metode untuk mendapatkan ukuran pakaian
    string getSize() { return size; }

    // Metode untuk mendapatkan bahan pakaian
    string getMaterial() { return material; }

    // Metode untuk mendapatkan jenis kelamin yang ditujukan pakaian
    string getGender() { return gender; }
};
