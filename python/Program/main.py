from shirt import Shirt  # Import kelas Shirt dari modul shirt

# Fungsi untuk mencetak header tabel dengan lebar kolom yang disesuaikan
def print_table_header(column_widths):
    print("+----+--------------+------------+------------+--------+------------+--------+---------+-------------+")
    print("| ID |     Name     |   Brand    |   Price    |  Size  |  Material  | Gender |  Color  | Sleeve Type |")
    print("+----+--------------+------------+------------+--------+------------+--------+---------+-------------+")

# Fungsi untuk mencetak footer tabel dengan lebar kolom yang disesuaikan
def print_table_footer(column_widths):
    print("+----+--------------+------------+------------+--------+------------+--------+---------+-------------+")

# Fungsi untuk mencetak daftar produk dalam bentuk tabel dengan lebar kolom yang disesuaikan
def print_shirts(shirts, column_widths):
    print_table_header(column_widths)

    # Loop melalui setiap produk dan mencetak informasi produk dalam baris tabel
    for shirt in shirts:
        info = shirt.display_info()  # Mendapatkan informasi produk
        # Mencetak baris tabel dengan lebar kolom yang disesuaikan
        print("| " + " | ".join(str(detail).ljust(width) for detail, width in zip(info, column_widths)) + " |")

    print_table_footer(column_widths)

if __name__ == "__main__":
    shirts = []  # List untuk menyimpan produk

    # Meminta pengguna untuk memasukkan jumlah produk
    num_products = int(input("Masukkan jumlah produk: "))
    if num_products < 3:
        print("Minimal harus 3 produk.")
    else:
        # Meminta pengguna untuk memasukkan detail produk dan menyimpannya dalam list
        for i in range(num_products):
            print(f"Masukkan informasi untuk produk ke-{i+1}:")
            idProduct = input("ID: ")
            name = input("Name: ")
            brand = input("Brand: ")
            price = input("Price: ")
            size = input("Size: ")
            material = input("Material: ")
            gender = input("Gender: ")
            color = input("Color: ")
            sleeve_type = input("Sleeve Type: ")

            # Membuat objek Shirt berdasarkan input pengguna dan menyimpannya dalam list
            shirt = Shirt(idProduct, name, brand, price, size, material, gender, color, sleeve_type)
            shirts.append(shirt)

        # Menghitung lebar kolom untuk menyesuaikan tabel
        column_widths = [2, 12, 10, 10, 6, 10, 6, 7, 11]
        for shirt in shirts:
            # Memperbarui lebar kolom jika diperlukan berdasarkan informasi produk
            column_widths[0] = max(column_widths[0], len(shirt.idProduct))
            column_widths[1] = max(column_widths[1], len(shirt.name))
            column_widths[2] = max(column_widths[2], len(shirt.brand))
            column_widths[3] = max(column_widths[3], len(shirt.price))
            column_widths[4] = max(column_widths[4], len(shirt.size))
            column_widths[5] = max(column_widths[5], len(shirt.material))
            column_widths[6] = max(column_widths[6], len(shirt.gender))
            column_widths[7] = max(column_widths[7], len(shirt.color))
            column_widths[8] = max(column_widths[8], len(shirt.sleeve_type))

        # Mencetak tabel produk dengan lebar kolom yang disesuaikan
        print_shirts(shirts, column_widths)
