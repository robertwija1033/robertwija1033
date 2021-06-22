public class Mahasiswa {
    String nama, studentID;
    Boolean jenisKelamin;
  
    public Mahasiswa(String nama, String studentID, Boolean jenisKelamin) {
        this.nama = nama;
        this.studentID = studentID;
        this.jenisKelamin = jenisKelamin;
    }
  
    public String getNama() {
        return this.nama;
    }
  
    public void setNama(String nama) {
        this.nama = nama;
    }
  
    public String getStudentID() {
        return this.studentID;
    }
  
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
  
    public Boolean getJenisKelamin() {
        return this.jenisKelamin;
    }
  
    public void setJenisKelamin(Boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
  
    @Override
    public String toString() {
        return "" + " " + getNama() + "\t\t" + " " + getStudentID() + "\t\t" + " " + (getJenisKelamin() == true ? "Wanita" : "Pria");
    }
}
