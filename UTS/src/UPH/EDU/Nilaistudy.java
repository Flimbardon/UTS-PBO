package UPH.EDU;

/* Nama : Felix Limbardon
    Kelas : 20TI2
    NIM : 03082200018*/

public class Nilaistudy {

    Matakuliah MataKuliah ;
    
    char NilaiHuruf;
    static int count = 1 ;


    public Nilaistudy(Matakuliah mk,char NilaiHuruf) {
        this.MataKuliah = mk;
        this.NilaiHuruf = NilaiHuruf;
    }

    public int getSKS(){
        int SKS = MataKuliah.SKS;
        return SKS;
    }

    public Matakuliah getMataKuliah() {
        return this.MataKuliah;
    }

    public void setMataKuliah(Matakuliah MataKuliah) {
        this.MataKuliah = MataKuliah;
    }

    public char getNilaiHuruf() {
        return this.NilaiHuruf;
    }

    public void setNilaiHuruf(char NilaiHuruf) {
        this.NilaiHuruf = NilaiHuruf;
    }

    public double getNilaiAngka() {
        Double nilaiangka = 0.0;
        if (NilaiHuruf == 'A'){
            nilaiangka = 4.0;
        }
        else if (NilaiHuruf == 'B'){
            nilaiangka = 3.0;
        }
        else if (NilaiHuruf == 'C'){
            nilaiangka = 2.0;
        }
        else if (NilaiHuruf == 'D'){
            nilaiangka = 1.0;
        }
        else {
            nilaiangka = 0.0;
        }
        return nilaiangka;
    }


    @Override
    public String toString() {
        return "" +
            "|| " + MataKuliah.getCodeMataKuliah() + 
            "|| " + MataKuliah.getNameMataKuliah() + 
            "|| " + MataKuliah.getSKS() +
            " " + this.NilaiHuruf;
    }
    
}