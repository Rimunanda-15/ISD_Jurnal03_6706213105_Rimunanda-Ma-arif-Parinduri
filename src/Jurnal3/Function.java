package Jurnal3;

public class Function {
    Node head;

    public Function(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null ;
    }

    public void listDepan(int nip, String nama, String divisi){
        Node node = new Node(nip,nama,divisi);
        node.next=head;
        head = node;
    }

    public void listBelakang(int nip, String nama, String divisi){
        Node node = new Node(nip,nama,divisi);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public Node hapusDepan(){
        if (!isEmpty()){
            Node temp = head;
            head = head.next;
            System.out.println("Hapus data berhasil");
            return temp;
        }else {
            System.out.println("maaf data kosong");
            return null;
        }
    }
    public Node hapusBelakang(){
        if (!isEmpty()){
            Node temp, temp2;
            temp = head;
            temp2 = null;

            while (temp.next != null){
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = temp.next;
            System.out.println("hapus data berhasil");
            return temp2;
        }else {
            System.out.println("list kosong");
            return null;
        }
    }
    public void tampilkan(){
        Node temp = head;
        if (temp == null){
            System.out.println("Data kosong");
        }else {
            while (temp != null){
                temp.tampil();
                temp = temp.next;
            }
        }
    }
}

