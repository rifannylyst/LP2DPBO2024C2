from clothing import Clothing  # Import kelas Clothing untuk mewarisi atribut dan metode

class Shirt(Clothing):  # Mendefinisikan kelas Shirt yang merupakan turunan dari Clothing
    def __init__(self, idProduct, name, brand, price, size, material, gender, color, sleeve_type):
        super().__init__(idProduct, name, brand, price, size, material, gender)  # Memanggil konstruktor kelas induk (Clothing)
        self.color = color  # Inisialisasi atribut color
        self.sleeve_type = sleeve_type  # Inisialisasi atribut sleeve_type

    def display_info(self):
        return super().display_info() + [self.color, self.sleeve_type]  # Mengembalikan informasi produk, termasuk informasi tambahan dari kelas Shirt
