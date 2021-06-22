package UPH.EDU;
import java.util.ArrayList;

public class Kartuhasilstudi {
 

    int semester ;

    Mahasiswa Mahasiswa;

    Matakuliah MataKuliah;
 
    ArrayList<Nilaistudy> NilaiStudi = new ArrayList<Nilaistudy>();

    public Kartuhasilstudi(int semester,Mahasiswa mhs){
        this.semester = semester;
        this.Mahasiswa = mhs;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Mahasiswa getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(Mahasiswa Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public ArrayList<Nilaistudy> getNilaiStudi() {
        return this.NilaiStudi;
    }

    public void setNilaiStudi(ArrayList<Nilaistudy> NilaiStudi) {
        this.NilaiStudi = NilaiStudi;
    }

    public void tambahNilaiStudi(Matakuliah mk,char nilai){
        Nilaistudy ns = new Nilaistudy(mk, nilai);
        NilaiStudi.add(ns);
    }
   
    public int totalSKS(){
        int total = 0;
        for (Nilaistudy nilai : NilaiStudi ){
            total += nilai.getSKS();
        }
        return total;
    }

    public double ipk(){
        double totalsatu = 0.0, totaldua = 0.0;
        for(Nilaistudy i : NilaiStudi){
            totalsatu += i.getNilaiAngka() * i.getMataKuliah().getSKS();
            totaldua += i.getSKS();
        }
        return totalsatu/totaldua;
    }

    public void tampilkanKHS(){
        int count = 1;
        System.out.println("Nama Mahasiswa : " + Mahasiswa.nama);
        System.out.println("Semester : " + semester);
        System.out.println("IPK : " + ipk());
        System.out.println("Total SKS : " + totalSKS());
        System.out.println("");
        System.out.println("Nilai");
        System.out.println("No. " +  "Kode MataKuliah " + "Nama MataKuliah " + "Sks " + "Nilai ");
        for(Nilaistudy a : NilaiStudi){
            System.out.print(count);
            System.out.println(a.toString());
            count++;
        }
    }
}


