package UPH.EDU;

 /* Nama : Felix Limbardon
    Kelas : 20TI2
    NIM : 03082200018*/

  
public class Matakuliah {
    int SKS;
    String CodeMataKuliah;
    String NameMataKuliah;

    public Matakuliah(String Codematakuliah,String Namematakuliah,int SKS) {
        this.CodeMataKuliah = Codematakuliah;
        this.NameMataKuliah = Namematakuliah;
        this.SKS = SKS;
    }

    public String getCodeMataKuliah() {
        return this.CodeMataKuliah;
    }

    public void setCodeMataKuliah(String CodeMataKuliah) {
        this.CodeMataKuliah = CodeMataKuliah;
    }

    public String getNameMataKuliah() {
        return this.NameMataKuliah;
    }

    public void setNameMataKuliah(String nameMataKuliah) {
        this.NameMataKuliah = NameMataKuliah;
    }

    public int getSKS() {
        return this.SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }
}