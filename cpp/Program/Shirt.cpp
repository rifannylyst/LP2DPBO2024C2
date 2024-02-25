/*
Saya Rifanny Lysara Annastasya [2200163] mengerjakan LP2 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek (DPBO) untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

#include "Clothing.cpp"

class Shirt : public Clothing {
protected:
    string color;       // Warna kemeja
    string sleeve_type; // Tipe lengan kemeja

public:
    // Konstruktor default untuk kelas Shirt
    Shirt() : color(""), sleeve_type("") {}

    // Konstruktor parameterized untuk kelas Shirt
    Shirt(string id, string n, string b, string p, string s, string m, string g, string c, string st)
        : Clothing(id, n, b, p, s, m, g), color(c), sleeve_type(st) {}

    // Metode untuk mendapatkan warna kemeja
    string getColor() { return color; }

    // Metode untuk mendapatkan tipe lengan kemeja
    string getSleeveType() { return sleeve_type; }
};
