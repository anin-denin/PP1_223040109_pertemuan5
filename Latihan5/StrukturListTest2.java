package Latihan5;


import java.util.Scanner;

public class StrukturListTest2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Buat list baru
        StrukturList list = new StrukturList();

        // Tambahkan elemen ke list
        System.out.println("Masukkan elemen list (pisahkan dengan spasi): ");
        String[] elements = input.nextLine().split(" ");
        for (String element : elements) {
            list.addTail(new Node(Integer.parseInt(element)));
        }

        // Tampilkan elemen list
        System.out.println("List sebelum dihapus: ");
        list.displayElement();

        // Hapus elemen di akhir list
        list.removeTail();

        // Tampilkan elemen list
        System.out.println("List setelah dihapus (akhir): ");
        list.displayElement();

        // Hapus elemen di awal list
        list.removeHead();

        // Tampilkan elemen list
        System.out.println("List setelah dihapus (awal): ");
        list.displayElement();
    }
}
