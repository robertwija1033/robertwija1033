public class Matakuliah {
    String kodeMatakuliah;
    String namaMatakuliah;
    Integer sks;
  
    public Matakuliah(String namaMatakuliah, String kodeMatakuliah, Integer sks) {
        this.namaMatakuliah = namaMatakuliah;
        this.kodeMatakuliah = kodeMatakuliah;
        this.sks = sks;
    }
  
    public Integer getSks() {
        return this.sks;
    }
  
    public String getKodeMatakuliah() {
        return this.kodeMatakuliah;
    }
  
    public String getNamaMatakuliah() {
        return this.namaMatakuliah;
    }
}