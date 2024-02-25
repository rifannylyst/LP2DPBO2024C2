class Product:
    # Mendefinisikan kelas Product dengan atribut idProduct, name, brand, dan price
    def __init__(self, idProduct, name, brand, price):
        # Konstruktor kelas Product dengan parameter idProduct, name, brand, dan price
        self.idProduct = idProduct
        self.name = name
        self.brand = brand
        self.price = price
        # Inisialisasi atribut idProduct, name, brand, dan price dengan nilai yang diberikan

    def display_info(self):
        # Metode untuk menampilkan informasi produk dalam bentuk list
        return [self.idProduct, self.name, self.brand, self.price]
        # Mengembalikan list yang berisi nilai idProduct, name, brand, dan price dari objek saat ini
