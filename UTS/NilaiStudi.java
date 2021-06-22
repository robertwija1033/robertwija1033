public class NilaiStudi {
    Matakuliah matakuliah;
    char nilaiHuruf;
  
    public NilaiStudi (Matakuliah matakuliah, char nilaiHuruf) {
        this.matakuliah = matakuliah;
        this.nilaiHuruf = nilaiHuruf;
    }
  
    public Matakuliah getMatakuliah() {
        return this.matakuliah;
    }
  
    public Double getNilaiAngka() {
        switch (this.nilaiHuruf) {
            case 'A':
            return 4.0;
            case 'B':
            return 3.0;
            case 'C':
            return 2.0;
            case 'D':
            return 1.0;
            case 'E':
            return 0.0;
        }
        return 0.0;
    }
}