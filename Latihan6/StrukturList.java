package Latihan6;

public class StrukturList {

    private Node HEAD;

    // Konstruktor untuk inisialisasi
    public StrukturList() {
        this.HEAD = null;
    }

    // Fungsi untuk menambahkan node baru di akhir/tail list
    public void addTail(Node data) {
        if (HEAD == null) {
            HEAD = data;
        } else {
            Node current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(data);
        }
    }

    // Fungsi untuk menambahkan node baru di posisi tengah list
    public void addMid(int data, int position) {
        if (HEAD == null || position == 0) {
            return; // Tidak melakukan apa-apa jika list kosong atau posisi 0
        }

        Node newNode = new Node(data);
        Node current = HEAD;
        Node prev = null;
        int count = 1;

        while (current != null && count < position) {
            prev = current;
            current = current.getNext();
            count++;
        }

        if (current == null) {
            return; // Tidak melakukan apa-apa jika posisi melebihi ukuran list
        }

        // Sisipkan node baru di posisi tengah
        newNode.setNext(current);
        if (prev != null) {
            prev.setNext(newNode);
        } else {
            HEAD = newNode; // Node baru menjadi HEAD jika posisi awal
        }
    }

    // Getter untuk mengembalikan HEAD aktual
    public Node getHEAD() {
        return HEAD;
    }

    // Menampilkan elemen-elemen dalam list
    public void displayElement() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // Method untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return HEAD == null; // List kosong jika HEAD null
    }

    // Fungsi untuk menghapus node dari awal (head) list
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp); // Panggil method dispose untuk membereskan node yang dihapus (opsional)
        }
    }

    // Method disposal untuk kemungkinan penggunaan (opsional)
    private void dispose(Node node) {
        // Implementasi untuk membereskan memory yang dialokasikan node (misal, setting field to null)
        // Sesuaikan dengan kebutuhan spesifik Anda
    }


    //Remove Tail
    public void removeTail() {
        if (isEmpty()) {
            System.out.println("List Kosong");
            return;
        }

        Node current = HEAD;
        Node prev = null;

        // Mencari node terakhir (tail)
        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }

        // Jika hanya ada satu elemen
        if (prev == null) {
            HEAD = null;
        } else {
            // Memutuskan hubungan tail dari list
            prev.setNext(null);
        }

        // Membereskan memory yang dialokasikan tail (opsional)
        dispose(current);
    }


    //removeMid
    public void removeMid(int e) {
        Node prevNode = new Node(0);
        Node tempNode;
        int i;
        boolean found; // Use a more descriptive variable name

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            found = false;
            i = 1;
            tempNode = HEAD;
            while (tempNode.getNext() != null && !found) {
                if (tempNode.getData() == e) {
                    found = true; // Found the element to remove
                } else {
                    prevNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (found) {
                if (i == 1) {
                    HEAD = null; // Remove the head node if it's the mid element
                } else {
                    prevNode.setNext(tempNode.getNext());
                    dispose(tempNode); // Optional: Dispose of the removed node (memory management)
                }
            } else {
                System.out.println("Elemen tidak ditemukan"); // Handle the case where element is not present
            }
        }
    }

}








