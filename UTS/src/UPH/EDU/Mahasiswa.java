package UPH.EDU;
    
 /* Nama : Felix Limbardon
    Kelas : 20TI2
    NIM : 03082200018*/

    public class Mahasiswa {

        String nama;
        
        
        public Mahasiswa() {
        }
    
        public Mahasiswa(String nama) {
            this.nama=nama;
        }
    
        public String getNama() {
            return this.nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        @Override
        public String toString() {
            return "" +
                "|| " + getNama() + "\t\t\t";
        }
    
        
    }