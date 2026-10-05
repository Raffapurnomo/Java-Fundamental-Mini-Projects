# Pyramid-Java
My own mini-project for learning java programming

Repositori ini berisikan mini=projek yang saya buat dengan Java yang mencetak pola piramida angka yang simetris berdasarkan input yang diberikan pengguna. Program ini berbasis *Command Line Interface* (CLI)

Projek ini saya kerjakan sebagai langkah awal saya terjun ke dunia IT dan pemrograman.

## Isi Projek
Isi dari projek ini membantu saya untuk memahami beberapa fondasi penting dalam bahasa pemrograman Java:
1. **Menerima input dari pengguna:** Menggunakan *Class* `Scanner` agar program dapat membaca input yang diberikan oleh pengguna.
2. **Logika *Nested Loops*:** saya menggunakan beberapa perulangan `for` dan didalam perulangan tersebut terdapat `for` lagi. `for` di dalam bertujuan untuk mengatur tata letak spasi, pola angka yang menurun, dan pola angka yang naik.
3. **Pengkondisian:** menggunakan `if-else` untuk menentukan output yang dikeluarkan.

## Cara Menjalankan Secara Lokal
1. Java Development Kit (JDK) sudah harus terinstall.
2. buka terminal atau *Command Prompt*, arahkan ke tempat file disimpan.
3. Melakukan kompilasi file Java dengan perintah:
   ```bash
   javac piramida.java
4. Jalankan program dengan perintah:
   ```bash
   java piramida
   ```
   Masukkan angka bulat (contoh: 5), lalu tekan enter:
5. Contoh output:
   ```plaintext
            1 
          2 1 2  
        3 2 1 2 3  
      4 3 2 1 2 3 4  
    5 4 3 2 1 2 3 4 5
