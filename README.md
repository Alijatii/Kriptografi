Penjelasan Kode:
Fungsi caesarCipher:
Parameter: text (teks yang akan diproses) dan shift (jumlah pergeseran).
Logika:
Mengiterasi setiap karakter dalam teks.
Memeriksa apakah karakter tersebut adalah huruf.
Menggeser karakter sesuai dengan nilai shift.
Menangani pembungkusan jika karakter hasil pergeseran melewati batas alfabet (misalnya, 'Z' + 1 menjadi 'A').
Menambahkan karakter hasil pergeseran ke dalam StringBuilder.
Karakter non-huruf dibiarkan sama.
Fungsi main:
Contoh penggunaan fungsi caesarCipher untuk enkripsi dan dekripsi.
