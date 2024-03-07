package Latihan6;

import java.util.Scanner;

public class StrukturListTest {

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

        // Hapus elemen di tengah list
        list.removeMid(3);

        // Tampilkan elemen list
        System.out.println("List setelah dihapus (elemen 3): ");
        list.displayElement();

        // Hapus elemen di tengah list
        list.removeMid(5);

        // Tampilkan elemen list
        System.out.println("List setelah dihapus (elemen 5): ");
        list.displayElement();
    }
}
