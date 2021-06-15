public class Tugas6 {
    public static void main(String[] args) throws Exception {
        mahasiswa mhs1 = new mahasiswa("Clavin", "01210121",false);
        mahasiswa mhs2 = new mahasiswa("SriRahayu", "01210121",true);
        mahasiswa mhs3 = new mahasiswa("Elvia", "01210121",true);
        matakuliah mataKuliah1 = new matakuliah("Struktur", "12.20", "3", "20TI2");
        matakuliah mataKuliah2 = new matakuliah("Struktur", "12.20", "3", "20TI1");
        matakuliah mataKuliah3 = new matakuliah("Struktur", "12.20", "3", "20SI2");
        dosen ds1 = new dosen("Pak Ade", "03082222", false);
        dosen ds2 = new dosen("Pak Adi", "03082222", false);
        dosen ds3 = new dosen("Pak Rudolfo", "030822", false);
        
        jadwalkuliah JadwalKuliah = new jadwalkuliah();

        JadwalKuliah.tambahMahasiswa(mhs1);
        JadwalKuliah.tambahMahasiswa(mhs2);
        JadwalKuliah.tambahMahasiswa(mhs3);

        JadwalKuliah.tambahMataKuliah(mataKuliah1);
        JadwalKuliah.tambahMataKuliah(mataKuliah2);
        JadwalKuliah.tambahMataKuliah(mataKuliah3);

        JadwalKuliah.tambahDosen(ds1);
        JadwalKuliah.tambahDosen(ds2);
        JadwalKuliah.tambahDosen(ds3);

        JadwalKuliah.tampilkanJadwalKuliah();
        System.out.println();

    }
}