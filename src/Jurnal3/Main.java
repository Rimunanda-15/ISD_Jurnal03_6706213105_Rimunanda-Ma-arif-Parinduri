package Jurnal3;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Function fungsi = new Function();
        Scanner s = new Scanner(System.in);
        int pilih;
        char kata;

        do {
            System.out.println("Pilihlah menu:");
            System.out.println("1. Input data");
            System.out.println("2. Hapus data");
            System.out.println("3. cetak List Pegawai");
            System.out.println("4. keluar");

            pilih = s.nextInt();

            if (pilih == 1){
                System.out.println("Tuliskan nip, nama, dan divisi pegawai");
                int nip = s.nextInt();
                String nama = s.next();
                String divisi = s.next();
                System.out.println("Tambahkan data di awal list  y/n");
                kata = s.next().charAt(0);
                if (kata == 'y') {
                    fungsi.listDepan(nip, nama, divisi);
                    System.out.println();
                }else if (kata == 'n'){
                    fungsi.listBelakang(nip,nama,divisi);
                }else {
                    System.out.println("input error");
                }

            }else if (pilih == 2){
                System.out.println("hapus data di awal list y/n");
                kata = s.next().charAt(0);
                if (kata == 'y') {
                    fungsi.hapusDepan();
                }else if (kata == 'n'){
                    fungsi.hapusBelakang();
                }
            }else if (pilih == 3){
                System.out.println("List Pegawai adalah :");
                fungsi.tampilkan();
            }else{
                System.out.println("keluar");
            }
        }while (pilih < 4);
    }
}
