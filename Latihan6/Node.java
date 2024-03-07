package Latihan6;

public class Node {
    private int data; // Menggunakan tipe data int untuk data
    private Node next;

    /* Inisialisasi data atribut node */

    public Node(int data) {
        this.data = data;
    }

    /* Setter & Getter */

    public int getData() { // Mengembalikan tipe data int
        return data;
    }

    public void setData(int data) { // Menerima parameter tipe data int
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
