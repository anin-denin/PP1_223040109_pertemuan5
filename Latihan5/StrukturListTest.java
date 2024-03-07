package Latihan5;

import java.util.LinkedList;

public class StrukturListTest {

    public static void main(String[] args) {
        // 1. Buat list dengan keyword new
        LinkedList<Integer> list = new LinkedList<>();

        // 2. Tambah elemen 2 di awal list
        list.addFirst(2);

        // 3. Tambah elemen 9 di awal list
        list.addFirst(9);

        // 4. Tambah elemen 7 di awal list
        list.addFirst(7);

        // 5. Tampilkan elemen list
        System.out.println("List sebelum dihapus: ");
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 6. Hapus elemen list di awal list
        list.removeFirst();

        // 7. Tampilkan elemen list
        System.out.println("List setelah dihapus: ");
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
