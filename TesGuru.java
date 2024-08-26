import java.util.Scanner;

public class TesGuru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.println("Masukkan Mapel : ");
        String mapel = input.nextLine();
        System.out.println("Masukkan Status : ");
        String status = input.nextLine();
        System.out.println("Masukkan NIP : ");
        int nip = input.nextInt();
        input.close();

        Guru guru = new Guru(nip, nama, mapel, status);
        guru.print();
        System.out.println("-------------");
        Guru rehan = new Guru(1234, "Rehan", "Mobile Legens", "Part-Time");
        Guru bagus = new Guru(9867, "Bagus", "Informatika", "full-Time");
        Guru firdaus = new Guru(3425, "Firdaus", "RPL", "Aktif");
        Guru thoriq = new Guru(9356, "Thoriq", "Olahraga", "Part-Time");
        Guru feni = new Guru(1700, "Feni", "Matematika", "Aktif");

        rehan.print();
        System.out.println("-------------");
        bagus.print();
        System.out.println("-------------");
        firdaus.print();
        System.out.println("-------------");
        thoriq.print();
        System.out.println("-------------");
        feni.print();
    }
}
