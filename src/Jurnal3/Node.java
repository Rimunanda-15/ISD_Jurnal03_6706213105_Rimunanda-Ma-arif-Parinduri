package Jurnal3;

public class Node {
    int nip;
    String nama;
    String divisi;
    Node next;

    public Node(int nip,String nama,String divisi){
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    public void tampil(){
        System.out.println();
        System.out.println("Pegawai{"+"NIP= '" + nip + "', Nama= '" + nama + "',divisi= '" + divisi +"'}");
    }
}
