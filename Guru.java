public class Guru {
    int nip;
    String nama,mapel,status;
    public Guru(int n, String a, String m, String s){
        nip = n;
        nama = a;
        mapel = m;
        status = s;
        }

        public void print(){
            System.out.println("NIP : " + nip);
            System.out.println("Nama : " + nama);
            
            System.out.println("Mapel : " + mapel);
            System.out.println("Status : " + status);
        }
    }
