import UPH.EDU.Mahasiswa;
import UPH.EDU.Matakuliah;
import UPH.EDU.Kartuhasilstudi;
import UPH.EDU.Nilaistudy;

import java.util.Scanner;


 /* Nama : Felix Limbardon
       Kelas : 20TI2
       NIM : 03082200018*/
    
public class App {

       public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        int pilih;
        char yn;

        do{

            Mahasiswa mhs = new Mahasiswa ("Felix");
        
            Matakuliah mk1 = new Matakuliah ("11111", "PBO", 2);
            Matakuliah mk2 = new Matakuliah ("22222", "B.INDO", 3);
            Matakuliah mk3 = new Matakuliah ("33333", "Filsafat", 4);


            Kartuhasilstudi khs = new Kartuhasilstudi(2,mhs);
            khs.tambahNilaiStudi(mk1, 'A');
            khs.tambahNilaiStudi(mk2, 'B');
            khs.tambahNilaiStudi(mk3, 'C');

            Mahasiswa mhs1 = new Mahasiswa("Yordan");
            Matakuliah mk4 = new Matakuliah("111111", "PBO", 2);
            Matakuliah mk5 = new Matakuliah("222222", "B.INDO", 3);
            Matakuliah mk6 = new Matakuliah("333333", "Filsafat", 4);

            Kartuhasilstudi khs1 = new Kartuhasilstudi(3,mhs1);
            khs1.tambahNilaiStudi(mk4, 'A');
            khs1.tambahNilaiStudi(mk5, 'B');
            khs1.tambahNilaiStudi(mk6, 'C');

            System.out.println("Program Nilai Mahasiswa");

            System.out.println("Pilih 1 : Tampilkan KHS");
            System.out.println("Pilih 2 : Exit");

            System.out.print("Pilih no : ");
            pilih = masukan.nextInt();
            System.out.println("");
            
            if (pilih == 1){
                khs.tampilkanKHS();
                System.out.println();
                khs1.tampilkanKHS();
                System.out.println();
            }
            else if(pilih == 2){
                break;
            }

            System.out.print("Melanjutkan perhitungan ? (y/n) : ");
            masukan.nextLine();
            String yesno = masukan.nextLine();
            yn = yesno.charAt(0);
        }while(yn=='y' || yn=='Y');

        masukan.close();

    }
}
