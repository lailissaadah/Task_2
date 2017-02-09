/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author user
 */
   public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Status;
    private char[] Nilai;
    private int i;

    public Mahasiswa() {
        this.Status = "Tidak Lulus";
        this.Nilai = new char[10];
        this.i = 0;
    }
    
    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Status = "Tidak Lulus";
        this.Nilai = new char[10];
        this.i = 0;
    }
    
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public void addNilai(char Nilai){
        this.Nilai[i] = Nilai;
        i = i+1;
    }
    
    public char getNilai(int i){
        char n = this.Nilai[i];
        return n;
    }
   
    public String toString(){
        String m = NIM + ", " + Nama + ", " + Status + ", " + "Nilai = ";
        for (int c = 0; c<i; c++){
            m = m + Nilai[c] + ", ";
        }
        return m;
    }
    
    public char cekNilai(Mahasiswa m){
        char def = 'X';
        for (int j=0;j<i;j++){
            for (int k=0;k<m.i;k++){
                if (m.Nilai[k] == Nilai[j]){
                    if (m.Nilai[k] < def){
                        def = m.Nilai[k];
                    }
                }
            }
        }
        return def;
    }
}
