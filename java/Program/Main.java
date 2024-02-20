/*
Saya Rifanny Lysara Annastasya [2200163] mengerjakan LP2 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek (DPBO) untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek-objek Product
        ArrayList<Product> shirts = new ArrayList<>();
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah shirt
        System.out.println("Masukkan jumlah shirt:");
        int numShirts = sc.nextInt();

        // Loop untuk meminta detail setiap shirt dari pengguna
        for (int i = 0; i < numShirts; i++) {
            System.out.println("\nMasukkan detail shirt ke- " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Brand: ");
            String brand = sc.next();
            System.out.print("Price: ");
            String price = sc.next();
            System.out.print("Size: ");
            String size = sc.next();            
            System.out.print("Material: ");
            String material = sc.next();
            System.out.print("Gender: ");
            String gender = sc.next();            
            System.out.print("Color: ");
            String color = sc.next();
            System.out.print("Sleeve Type: ");
            String sleeveType = sc.next();

            // Menambahkan objek Shirt baru ke dalam ArrayList shirts
            shirts.add(new Shirt(id, name, brand, price, size, material, gender, color, sleeveType));
        }

        // Menutup objek Scanner setelah selesai digunakan
        sc.close();

        // Menampilkan daftar shirts yang telah dimasukkan
        System.out.println("\nList of Shirts:");
        printShirts(shirts);
    }

    // Method untuk mencetak daftar shirts dalam bentuk tabel
    private static void printShirts(ArrayList<Product> shirts) {
        // Array untuk menyimpan lebar kolom-kolom tabel
        int[] columnWidths = new int[]{3, 12, 10, 9, 6, 10, 6, 7, 11};

        // Loop untuk menentukan lebar maksimum setiap kolom
        for (Product shirt : shirts) {
            columnWidths[0] = Math.max(columnWidths[0], shirt.getIdProduct().length());
            columnWidths[1] = Math.max(columnWidths[1], shirt.getName().length());
            columnWidths[2] = Math.max(columnWidths[2], shirt.getBrand().length());
            columnWidths[3] = Math.max(columnWidths[3], shirt.getPrice().length());
            columnWidths[4] = Math.max(columnWidths[4], String.valueOf(((Shirt) shirt).getSize()).length());
            columnWidths[5] = Math.max(columnWidths[5], ((Shirt) shirt).getMaterial().length());
            columnWidths[6] = Math.max(columnWidths[6], String.valueOf(((Shirt) shirt).getGender()).length());
            columnWidths[7] = Math.max(columnWidths[7], ((Shirt) shirt).getColor().length());
            columnWidths[8] = Math.max(columnWidths[8], ((Shirt) shirt).getSleeveType().length());
        }

        // Mencetak header tabel
        printTableHeader(columnWidths);
        // Loop untuk mencetak setiap baris data dalam tabel
        for (Product shirt : shirts) {
            System.out.printf("| %-"+ columnWidths[0] +"s| %-"+ columnWidths[1] +"s | %-"+ columnWidths[2] +"s | $%-"+ columnWidths[3] +"s | %-"+ columnWidths[4] +"s | %-"+ columnWidths[5] +"s | %-"+ columnWidths[6] +"s | %-"+ columnWidths[7] +"s | %-"+ columnWidths[8] +"s |\n",
                    shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), shirt.getPrice(),
                    ((Shirt) shirt).getSize(), ((Shirt) shirt).getMaterial(), ((Shirt) shirt).getGender(), ((Shirt) shirt).getColor(), ((Shirt) shirt).getSleeveType());
        }
        // Mencetak footer tabel
        printTableFooter(columnWidths);
    }

    // Method untuk mencetak header tabel
    private static void printTableHeader(int[] columnWidths) {
        System.out.println("+----+--------------+------------+------------+--------+------------+--------+---------+-------------+");
        System.out.print("| ID |     Name     |   Brand    |   Price    |  Size  |  Material  | Gender |  Color  | Sleeve Type |");
        System.out.println("\n+----+--------------+------------+------------+--------+------------+--------+---------+-------------+");
    }

    // Method untuk mencetak footer tabel
    private static void printTableFooter(int[] columnWidths) {
        System.out.println("+----+--------------+------------+------------+--------+------------+--------+---------+-------------+");
    }
}
