import java.util.ArrayList;

public class jadwalkuliah {
    ArrayList<mahasiswa> Mahasiswa = new ArrayList<mahasiswa>();
    ArrayList<dosen> Dosen = new ArrayList<dosen>();
    ArrayList<matakuliah> Matakuliah = new ArrayList<matakuliah>();
    //ruangan

    public jadwalkuliah(ArrayList<mahasiswa> Mahasiswa, ArrayList<dosen> Dosen, ArrayList<matakuliah> Matakuliah) {
        this.Mahasiswa = Mahasiswa;
        this.Dosen = Dosen;
        this.Matakuliah = Matakuliah;
    }

    public ArrayList<mahasiswa> getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(ArrayList<mahasiswa> Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public ArrayList<dosen> getDosen() {
        return this.Dosen;
    }

    public void setDosen(ArrayList<dosen> Dosen) {
        this.Dosen = Dosen;
    }

    public ArrayList<matakuliah> getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(ArrayList<matakuliah> Matakuliah) {
        this.Matakuliah = Matakuliah;
    }

    public void tambahMahasiswa(mahasiswa mhs){
        Mahasiswa.add(mhs);
    }

    public void tambahDosen(dosen Ds){
        Dosen.add(Ds);
    }
    public void tambahMataKuliah(matakuliah mk){
        Matakuliah.add(mk);
    }


    public void tampilkanJadwalKuliah(){
        System.out.println("=================================");
        for(matakuliah mk : Matakuliah){
            System.out.println(mk.toString());
        }
        System.out.println("=================================");
        System.out.println("Nama Matakuliah : ");

        System.out.println("Dosen ");
        System.out.println("Kelas ");

        System.out.println("=================================");
        System.out.println("Daftar Mahasiswa ");
        System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");
        for(mahasiswa mhs : Mahasiswa){
            System.out.println(mhs.toString());
        }
    }

}