<?php
// Product.php

class Product {
    // Properti yang digunakan untuk menyimpan informasi produk
    protected $idProduct; // ID produk
    protected $name;      // Nama produk
    protected $brand;     // Merek produk
    protected $price;     // Harga produk

    // Setter untuk mengatur nilai ID produk
    public function setIdProduct($idProduct) {
        $this->idProduct = $idProduct;
    }

    // Setter untuk mengatur nilai nama produk
    public function setName($name) {
        $this->name = $name;
    }

    // Setter untuk mengatur nilai merek produk
    public function setBrand($brand) {
        $this->brand = $brand;
    }

    // Setter untuk mengatur nilai harga produk
    public function setPrice($price) {
        $this->price = $price;
    }

    // Getter untuk mengakses nilai ID produk
    public function getIdProduct() {
        return $this->idProduct;
    }

    // Getter untuk mengakses nilai nama produk
    public function getName() {
        return $this->name;
    }

    // Getter untuk mengakses nilai merek produk
    public function getBrand() {
        return $this->brand;
    }

    // Getter untuk mengakses nilai harga produk
    public function getPrice() {
        return $this->price;
    }
}
?>
