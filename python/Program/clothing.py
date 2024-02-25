from product import Product  # Impor kelas Product dari modul product
                             # Digunakan untuk melakukan pewarisan dari kelas Product ke kelas Clothing

class Clothing(Product):      # Mendefinisikan kelas Clothing yang merupakan turunan dari kelas Product
    def __init__(self, idProduct, name, brand, price, size, material, gender):
        super().__init__(idProduct, name, brand, price)  # Memanggil konstruktor kelas induk (Product) dengan parameter yang diberikan
        self.size = size         # Inisialisasi atribut size
        self.material = material # Inisialisasi atribut material
        self.gender = gender     # Inisialisasi atribut gender

    def display_info(self):
        # Mengembalikan informasi produk dari kelas Clothing bersama dengan informasi dari kelas Product
        return super().display_info() + [self.size, self.material, self.gender]
