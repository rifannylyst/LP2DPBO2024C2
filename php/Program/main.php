<?php
// main.php

// Mengimpor kelas Shirt untuk membuat objek-objek kelas Shirt
include 'Shirt.php';

// Membuat objek-objek kelas cucu dengan masukan yang di-hardcode
$shirt1 = new Shirt(); // Membuat objek kelas Shirt pertama
$shirt1->setIdProduct("1"); // Mengatur ID produk untuk shirt1
$shirt1->setName("Rifanny"); // Mengatur nama
$shirt1->setBrand("Uniqlo"); // Mengatur merek produk untuk shirt1
$shirt1->setPrice("$25"); // Mengatur harga produk untuk shirt1
$shirt1->setSize("M"); // Mengatur ukuran produk untuk shirt1
$shirt1->setMaterial("Cotton"); // Mengatur bahan produk untuk shirt1
$shirt1->setGender("Male"); // Mengatur jenis kelamin untuk shirt1
$shirt1->setColor("Blue"); // Mengatur warna produk untuk shirt1
$shirt1->setSleeveType("Long Sleeve"); // Mengatur jenis lengan produk untuk shirt1

$shirt2 = new Shirt(); // Membuat objek kelas Shirt kedua
$shirt2->setIdProduct("2"); // Mengatur ID produk untuk shirt2
$shirt2->setName("Lysara"); // Mengatur nama 
$shirt2->setBrand("ZARA"); // Mengatur merek produk untuk shirt2
$shirt2->setPrice("$30"); // Mengatur harga produk untuk shirt2
$shirt2->setSize("L"); // Mengatur ukuran produk untuk shirt2
$shirt2->setMaterial("Polyester"); // Mengatur bahan produk untuk shirt2
$shirt2->setGender("Female"); // Mengatur jenis kelamin untuk shirt2
$shirt2->setColor("Red"); // Mengatur warna produk untuk shirt2
$shirt2->setSleeveType("Short Sleeve"); // Mengatur jenis lengan produk untuk shirt2

$shirt3 = new Shirt(); // Membuat objek kelas Shirt ketiga
$shirt3->setIdProduct("3"); // Mengatur ID produk untuk shirt3
$shirt3->setName("Annastasya"); // Mengatur nama 
$shirt3->setBrand("Levis"); // Mengatur merek produk untuk shirt3
$shirt3->setPrice("$20"); // Mengatur harga produk untuk shirt3
$shirt3->setSize("S"); // Mengatur ukuran produk untuk shirt3
$shirt3->setMaterial("Silk"); // Mengatur bahan produk untuk shirt3
$shirt3->setGender("Unisex"); // Mengatur jenis kelamin untuk shirt3
$shirt3->setColor("White"); // Mengatur warna produk untuk shirt3
$shirt3->setSleeveType("Long Sleeve"); // Mengatur jenis lengan produk untuk shirt3

// Membuat tabel dengan gaya yang diinginkan menggunakan CSS
echo "
<style>
    table {
        border-collapse: collapse; // Menggabungkan batas sel dalam tabel
        width: 50%; // Menetapkan lebar tabel menjadi 50% dari lebar kontainer
    }
    th, td {
        border: 1px solid black; // Mengatur border pada sel tabel
        padding: 8px; // Mengatur padding di dalam sel tabel
        text-align: center; // Mengatur teks di dalam sel tabel menjadi rata tengah
    }
</style>";

// Membuat tabel HTML
echo "
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Brand</th>
        <th>Price</th>
        <th>Size</th>
        <th>Material</th>
        <th>Gender</th>
        <th>Color</th>
        <th>Sleeve Type</th>
    </tr>";

// Mengisi baris tabel dengan data kelas cucu menggunakan printf
printf("
    <tr>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
    </tr>
    <tr>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
    </tr>
    <tr>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
        <td>%s</td>
    </tr>",
    // Data untuk shirt1
    $shirt1->getIdProduct(), $shirt1->getName(), $shirt1->getBrand(), $shirt1->getPrice(), $shirt1->getSize(), $shirt1->getMaterial(), $shirt1->getGender(), $shirt1->getColor(), $shirt1->getSleeveType(),
    // Data untuk shirt2
    $shirt2->getIdProduct(), $shirt2->getName(), $shirt2->getBrand(), $shirt2->getPrice(), $shirt2->getSize(), $shirt2->getMaterial(), $shirt2->getGender(), $shirt2->getColor(), $shirt2->getSleeveType(),
    // Data untuk shirt3
    $shirt3->getIdProduct(), $shirt3->getName(), $shirt3->getBrand(), $shirt3->getPrice(), $shirt3->getSize(), $shirt3->getMaterial(), $shirt3->getGender(), $shirt3->getColor(), $shirt3->getSleeveType()
);

// Menutup tabel HTML
echo "</table>";
?>
