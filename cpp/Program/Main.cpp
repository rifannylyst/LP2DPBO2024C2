/*
Saya Rifanny Lysara Annastasya [2200163] mengerjakan LP2 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek (DPBO) untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

#include "Shirt.cpp"
#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;

// Method untuk mencetak header tabel
void printTableHeader(const vector<int>& columnWidths) {
    cout << "+----+--------------+------------+------------+--------+------------+--------+---------+-------------+" << endl;
    cout << "| ID |     Name     |   Brand    |   Price    |  Size  |  Material  | Gender |  Color  | Sleeve Type |" << endl;
    cout << "+----+--------------+------------+------------+--------+------------+--------+---------+-------------+" << endl;
}

// Method untuk mencetak footer tabel
void printTableFooter(const vector<int>& columnWidths) {
    cout << "+----+--------------+------------+------------+--------+------------+--------+---------+-------------+" << endl;
}

// Method untuk mencetak daftar produk dalam bentuk tabel
void printShirts(const vector<Product*>& shirts, const vector<int>& columnWidths) {
    // Mencetak header tabel
    printTableHeader(columnWidths);

    // Loop untuk mencetak setiap baris data dalam tabel
    for (const auto& shirt : shirts) {
        cout << "| " << setw(columnWidths[0]) << shirt->getIdProduct() << " | "
             << setw(columnWidths[1]) << shirt->getName() << " | "
             << setw(columnWidths[2]) << shirt->getBrand() << " | "
             << setw(columnWidths[3]) << shirt->getPrice() << " | ";
             
        // Menyaring apakah objek adalah instance dari kelas Shirt
        if (Shirt* s = dynamic_cast<Shirt*>(shirt)) {
            cout << setw(columnWidths[4]) << s->getSize() << " | "
                 << setw(columnWidths[5]) << s->getMaterial() << " | "
                 << setw(columnWidths[6]) << s->getGender() << " | "
                 << setw(columnWidths[7]) << s->getColor() << " | "
                 << setw(columnWidths[8]) << s->getSleeveType() << " |" << endl;
        }
    }

    // Mencetak footer tabel
    printTableFooter(columnWidths);
}

int main() {
    // Membuat vector untuk menyimpan objek-objek Product
    vector<Product*> shirts;

    // Meminta pengguna untuk memasukkan jumlah produk (minimal 3)
    int numProducts;
    do {
        cout << "Masukkan jumlah produk: ";
        cin >> numProducts;
    } while (numProducts < 3);

    // Meminta pengguna untuk memasukkan detail produk
    for (int i = 0; i < numProducts; ++i) {
        string id, name, brand, price, size, material, gender, color, sleeveType;

        cout << "\nMasukkan detail produk ke-" << (i + 1) << ":" << endl;
        cout << "ID: ";
        cin >> id;
        cout << "Name: ";
        cin.ignore(); // clear input buffer
        getline(cin, name);
        cout << "Brand: ";
        getline(cin, brand);
        cout << "Price: ";
        getline(cin, price);
        cout << "Size: ";
        getline(cin, size);
        cout << "Material: ";
        getline(cin, material);
        cout << "Gender: ";
        getline(cin, gender);
        cout << "Color: ";
        getline(cin, color);
        cout << "Sleeve Type: ";
        getline(cin, sleeveType);

        // Tambahkan produk baru ke dalam vector
        shirts.push_back(new Shirt(id, name, brand, price, size, material, gender, color, sleeveType));
    }

    // Menentukan lebar kolom-kolom tabel secara dinamis
    vector<int> columnWidths = {2, 12, 10, 10, 6, 10, 6, 7, 11};
    for (const auto& shirt : shirts) {
        columnWidths[0] = max(columnWidths[0], static_cast<int>(shirt->getIdProduct().length()));
        columnWidths[1] = max(columnWidths[1], static_cast<int>(shirt->getName().length()));
        columnWidths[2] = max(columnWidths[2], static_cast<int>(shirt->getBrand().length()));
        columnWidths[3] = max(columnWidths[3], static_cast<int>(shirt->getPrice().length()));
        if (Shirt* s = dynamic_cast<Shirt*>(shirt)) {
            columnWidths[4] = max(columnWidths[4], static_cast<int>(s->getSize().length()));
            columnWidths[5] = max(columnWidths[5], static_cast<int>(s->getMaterial().length()));
            columnWidths[6] = max(columnWidths[6], static_cast<int>(s->getGender().length()));
            columnWidths[7] = max(columnWidths[7], static_cast<int>(s->getColor().length()));
            columnWidths[8] = max(columnWidths[8], static_cast<int>(s->getSleeveType().length()));
        }
    }

    // Menampilkan data dari semua produk dalam bentuk tabel
    printShirts(shirts, columnWidths);

    // Hapus objek yang telah dialokasikan secara dinamis
    for (auto& shirt : shirts) {
        delete shirt;
    }

    return 0;
}
