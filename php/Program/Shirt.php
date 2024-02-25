<?php
// Shirt.php

include 'Clothing.php'; // Mengimpor kelas Clothing untuk mewarisi atribut dan metode

class Shirt extends Clothing { // Mendefinisikan kelas Shirt yang merupakan turunan dari kelas Clothing
    protected $color; // Properti untuk menyimpan warna kemeja
    protected $sleeveType; // Properti untuk menyimpan tipe lengan kemeja

    public function setColor($color) { // Metode untuk mengatur warna kemeja
        $this->color = $color; // Mengatur nilai properti color dengan nilai yang diberikan
    }

    public function setSleeveType($sleeveType) { // Metode untuk mengatur tipe lengan kemeja
        $this->sleeveType = $sleeveType; // Mengatur nilai properti sleeveType dengan nilai yang diberikan
    }

    public function getColor() { // Metode untuk mendapatkan warna kemeja
        return $this->color; // Mengembalikan nilai properti color
    }

    public function getSleeveType() { // Metode untuk mendapatkan tipe lengan kemeja
        return $this->sleeveType; // Mengembalikan nilai properti sleeveType
    }
}
?>
