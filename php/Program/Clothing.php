<?php
// Clothing.php

// Mengimpor kelas Product.php untuk digunakan dalam definisi kelas Clothing
include 'Product.php';

// Membuat kelas Clothing yang merupakan turunan dari kelas Product
class Clothing extends Product {
    // Mendefinisikan properti-propterti yang spesifik untuk pakaian (ukuran, bahan, jenis kelamin)
    protected $size;
    protected $material;
    protected $gender;

    // Method untuk menetapkan ukuran pakaian
    public function setSize($size) {
        $this->size = $size;
    }

    // Method untuk menetapkan bahan pakaian
    public function setMaterial($material) {
        $this->material = $material;
    }

    // Method untuk menetapkan jenis kelamin pakaian
    public function setGender($gender) {
        $this->gender = $gender;
    }

    // Method untuk mengambil ukuran pakaian
    public function getSize() {
        return $this->size;
    }

    // Method untuk mengambil bahan pakaian
    public function getMaterial() {
        return $this->material;
    }

    // Method untuk mengambil jenis kelamin pakaian
    public function getGender() {
        return $this->gender;
    }
}
?>
